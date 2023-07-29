
package DAO;

import Classes.Categoria;
import java.sql.PreparedStatement;
import conexao.conn;
public class CategoriaDAO {
    
    public void categoriaProduto(Categoria produto) {
        String sql = "INSERT INTO CATEGORIA (NOME,DESCRICAO(?,?)";

        PreparedStatement ps = null;

        try {

            ps = conn.getConnection().prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getDescricao());
            ps.execute();
            ps.close();
        } catch (Exception e) {
            System.out.println("Produto não encontrado!");
        }
    }
}
