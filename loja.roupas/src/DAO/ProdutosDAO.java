
package DAO;

import Classes.Produtos;
import conexao.conn;
import java.sql.PreparedStatement;


public class ProdutosDAO {
    
     public void produtosRoupas(Produtos roupas) {
        String sql = "INSERT INTO PRODUTOS (NOME,MARCA,TAM,QUANTIDADE,VALOR(?,?,?,?,?)";

        PreparedStatement ps = null;

        try {

            ps = conn.getConnection().prepareStatement(sql);
            ps.setString(1, roupas.getNome());
            ps.setString(2, roupas.getMarca());
            ps.setString(3, roupas.getTam());
            ps.setInt(4, roupas.getQuantidade());
            ps.setDouble(5, roupas.getValor());
            ps.execute();
            ps.close();
            System.out.println("Produto cadastrado.");
        } catch (Exception e) {
            System.out.println("Produto não cadastrado.");
        }
    }
}
