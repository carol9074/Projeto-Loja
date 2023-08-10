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
            ps.setString(2, compras.getData_entrega());
            ps.execute();
            ps.close();
            System.out.println("Compra finalizada.");
        } catch (Exception e) {
            System.out.println("Compra não realizada.");
        }
    }

       public void removeCarrinho(int id_carrinho, int id_produto) {

        String sql = "DELETE FROM CARRINHO WHERE carrinho_id_compra = ? AND produtos_id_produtos";
        PreparedStatement ps = null;

        try {
            ps = conn.getConnection().prepareStatement(sql);
            ps.setInt(1, id_carrinho);
            ps.setInt(2, id_produto);
            ps.execute();
            ps.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateCarrinho( int quantidade, int id_compras) {

        String sql = "UPDATE CARRINHO SET QUANTIDADE = ? WHERE id_compras = ?";
        PreparedStatement ps = null;

        try {
            ps = conn.getConnection().prepareStatement(sql);
            ps.setInt(1, quantidade);
            ps.setInt(2, id_compras);
            ps.execute();
            ps.close();

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
