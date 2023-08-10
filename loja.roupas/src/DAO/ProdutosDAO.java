package DAO;

import Classes.Produtos;
import conexao.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProdutosDAO {

    public void produtosRoupas(Produtos roupas,int id_produtos) {
        String sql = "INSERT INTO PRODUTOS (ID_PRODUTOS,NOME,MARCA,TAM,QUANTIDADE,VALOR) VALUES (?,?,?,?,?,?)";

        PreparedStatement ps = null;

        try {

            ps = conn.getConnection().prepareStatement(sql);
            ps.setInt(1, id_produtos);
            ps.setString(2, roupas.getNome());
            ps.setString(3, roupas.getMarca());
            ps.setString(4, roupas.getTam());
            ps.setInt(5, roupas.getQuantidade());
            ps.setDouble(6, roupas.getValor());          
            
            ps.execute();
            ps.close();
            System.out.println("Produto cadastrado.");
        } catch (Exception e) {            
            System.out.println(e);
        }
    }

    public ArrayList<Produtos> find() {

        String sql = "SELECT * FROM PRODUTOS ";
        ResultSet rs;
        PreparedStatement ps = null;
        ArrayList<Produtos> lojas = new ArrayList<>();

        try {
            ps = conn.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Produtos roupas = new Produtos();
                roupas.setId_produto(rs.getInt("id_produtos"));
                roupas.setNome(rs.getString("nome"));
                roupas.setMarca(rs.getString("marca"));
                roupas.setTam(rs.getString("tam"));
                roupas.setQuantidade(rs.getInt("quantidade"));
                roupas.setValor(rs.getDouble("valor"));
                lojas.add(roupas);
            }

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return lojas;
    }

    public void removeProduto(int id_produtos) {

        String sql = "DELETE FROM PRODUTOS WHERE id_produtos = ?";
        PreparedStatement ps = null;

        try {
            ps = conn.getConnection().prepareStatement(sql);
            ps.setInt(1, id_produtos);
            ps.execute();
            ps.close();
            System.out.println("Produto deletado.");

        } catch (Exception e) {
            System.out.println("Produto não deletado.");

        }
    }

    public void updateProduto(int quantidade, double valor, int id_produtos) {

        String sql = "UPDATE PRODUTOS SET QUANTIDADE = ?, VALOR = ? WHERE id_produtos = ?";
        PreparedStatement ps = null;

        try {
            ps = conn.getConnection().prepareStatement(sql);
            ps.setInt(1, quantidade);
            ps.setDouble(2, valor);
            ps.setInt(3, id_produtos);
            ps.execute();
            ps.close();
            System.out.println("Produto atualizado.");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Produto não atualizada.");

        }
    }

}
