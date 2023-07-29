package DAO;

import java.sql.PreparedStatement;
import Classes.Cliente;
import conexao.conn;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClienteDAO {

    public void cadastroCliente(Cliente dados) {
        String sql = "INSERT INTO CADASTRO_CLIENTE (NOME,CPF,EMAIL,CELL,SENHA_ACESSO)VALUES(?,?,?,?,?)";

        PreparedStatement ps = null;

        try {

            ps = conn.getConnection().prepareStatement(sql);
            ps.setString(1, dados.getNome());
            ps.setString(2, dados.getCpf());
            ps.setString(3, dados.getEmail());
            ps.setString(4, dados.getCell());
            ps.setString(5, dados.getSenha_acesso());
            ps.execute();
            ps.close();
            System.out.println("Cadastro concluído com sucesso!");
        } catch (Exception e) {
            System.out.println("Cadastro não realizado!");
        }
    }

    public ArrayList<Cliente> find() {

        String sql = "SELECT * FROM CADASTRO_CLIENTE";
        ResultSet rs;
        PreparedStatement ps = null;
        ArrayList<Cliente> usuario = new ArrayList<>();

        try {
            ps = conn.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Cliente dados = new Cliente();
                dados.setId_cliente(rs.getInt("id_cliente"));
                dados.setNome(rs.getString("nome"));
                dados.setCpf(rs.getString("cpf"));
                dados.setEmail(rs.getString("email"));
                dados.setCell(rs.getString("cell"));
                dados.setSenha_acesso(rs.getString("senha_acesso"));
                usuario.add(dados);
            }

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return usuario;
    }

    public Cliente FindByLogincliente(String email, String senha_acesso) {

        Cliente login = new Cliente();
        String sql = "SELECT * FROM CADASTRO_CLIENTE WHERE EMAIL = ? AND SENHA_ACESSO = ?";
        ResultSet rs;
        PreparedStatement ps = null;

        try {
            ps = conn.getConnection().prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, senha_acesso);
            rs = ps.executeQuery();
            rs.next();
            login.setNome(rs.getString("nome"));
            login.setEmail(rs.getString("email"));
            login.setSenha_acesso(rs.getString("senha_acesso"));
            ps.close();
            return login;

        } catch (Exception e) {
            System.out.println("Cliente não cadastrado!");
            return null;
        }
    }

    public void FindByAndRemove(int id_cliente) {

        String sql = "DELETE FROM CADASTRO_CLIENTE WHERE id_cliente = ?";
        PreparedStatement ps = null;

        try {
            ps = conn.getConnection().prepareStatement(sql);
            ps.setInt(1, id_cliente);
            ps.execute();
            ps.close();
            System.out.println("Conta deletada.");

        } catch (Exception e) {
            System.out.println("Conta não deletada.");

        }
    }

    public void FindByAndUpdate(String cell, String senha_acesso, int qualquercoisa) {

        String sql = "UPDATE CADASTRO_CLIENTE SET CELL = ?, SENHA_ACESSO = ? WHERE id_cliente = ?";
        PreparedStatement ps = null;

        try {
            ps = conn.getConnection().prepareStatement(sql);
            ps.setString(1, cell);
            ps.setString(2, senha_acesso);
            ps.setInt(3, qualquercoisa);
            ps.execute();
            ps.close();
            System.out.println("Conta atualizada.");

        } catch (Exception e) {   
            System.out.println(e);
            System.out.println("Conta não atualizada.");

        }
    }

}
