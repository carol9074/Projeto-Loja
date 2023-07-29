package DAO;

import Classes.Carrinho;
import conexao.conn;
import java.sql.PreparedStatement;

public class CarrinhoDAO {

    public void finalizarCarrinho(Carrinho compras) {
        String sql = "INSERT INTO CARRINHO (QUANTIDADE,DATA_ENTREGA)VALUES(?,?)";

        PreparedStatement ps = null;

        try {
            ps = conn.getConnection().prepareStatement(sql);
            ps.setInt(1, compras.getQuantidade());
            ps.setString(2,compras.getData_entrega());
            ps.execute();
            ps.close();
            System.out.println("Compra finalizada.");
        } catch (Exception e) {
            System.out.println("Compra não realizada.");
        }
    }
}
