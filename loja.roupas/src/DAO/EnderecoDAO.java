package DAO;

import Classes.Endereco;
import java.sql.ResultSet;
import conexao.conn;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class EnderecoDAO {

    public void enderecoGeral(Endereco geral) {
        String sql = "INSERT INTO ENDERECO (RUA,NUMERO,BAIRRO,CIDADE,UF(?,?,?,?,?)";

        PreparedStatement ps = null;

        try {

            ps = conn.getConnection().prepareStatement(sql);
            ps.setString(1, geral.getRua());
            ps.setInt(2, geral.getNumero());
            ps.setString(3, geral.getBairro());
            ps.setString(4, geral.getCidade());
            ps.setString(5, geral.getUF());
            ps.execute();
            ps.close();
            System.out.println("Endereço cadastrado.");
        } catch (Exception e) {
            System.out.println("Endereço não cadastrado.");
        }
    }

    public ArrayList<Endereco> find() {

        String sql = "SELECT * FROM ENDERECO";
        ResultSet rs;
        PreparedStatement ps = null;
        ArrayList<Endereco> lista = new ArrayList<>();

        try {
            ps = conn.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Endereco geral = new Endereco();
                geral.setId_endereco(rs.getInt("id_endereco"));
                geral.setRua(rs.getString("rua"));
                geral.setNumero(rs.getInt("numero"));
                geral.setBairro(rs.getString("bairro"));
                geral.setCidade(rs.getString("cidade"));
                geral.setUF(rs.getString("UF"));
               lista.add(geral);
            }

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return lista;
    }
}
