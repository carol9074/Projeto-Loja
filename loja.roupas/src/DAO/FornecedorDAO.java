package DAO;

import Classes.Fornecedor;
import conexao.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FornecedorDAO {

    public void fornecedorLoja(Fornecedor loja) {
        String sql = "INSERT INTO FORNECEDORES (NOME,CNPJ,CELL,EMAIL,SENHA_ACESSO(?,?,?,?,?)";

        PreparedStatement ps = null;

        try {

            ps = conn.getConnection().prepareStatement(sql);
            ps.setString(1, loja.getNome());
            ps.setString(2, loja.getCnpj());
            ps.setString(3, loja.getCell());
            ps.setString(4, loja.getEmail());
            ps.setString(5, loja.getSenha_acesso());
            ps.execute();
            ps.close();
            System.out.println("Cadastrado concluído com sucesso.");
        } catch (Exception e) {
            System.out.println("Não tem cadastrado.");
        }
    }

    public ArrayList<Fornecedor> find() {

        String sql = "SELECT * FROM FORNECEDORES";
        ResultSet rs;
        PreparedStatement ps = null;
        ArrayList<Fornecedor> cadastro = new ArrayList<>();

        try {
            ps = conn.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Fornecedor informacao = new Fornecedor();
                informacao.setId_fornecedor(rs.getInt("id_fornecedor"));
                informacao.setNome(rs.getString("nome"));
                informacao.setCnpj(rs.getString("cnpj"));
                informacao.setCell(rs.getString("cell"));
                informacao.setEmail(rs.getString("email"));
                informacao.setSenha_acesso(rs.getString("senha_acesso"));
                cadastro.add(informacao);
            }

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return cadastro;
    }

    public Fornecedor FindByLoginfornecedor(String email, String senha_acesso) {

        Fornecedor logar = new Fornecedor();
        String sql = "SELECT * FROM FORNECEDORES WHERE EMAIL = ? AND SENHA_ACESSO = ?";
        ResultSet rs;
        PreparedStatement ps = null;

        try {
            ps = conn.getConnection().prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, senha_acesso);
            rs = ps.executeQuery();
            rs.next();
            logar.setNome(rs.getString("nome"));
            logar.setEmail(rs.getString("email"));
            logar.setSenha_acesso(rs.getString("senha_acesso"));
            ps.close();
           
             
            return logar;

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Fornecedor não cadastrado!");
            return null;
        }
    }

    public void removeFornecedor(int id_fornecedor) {

        String sql = "DELETE FROM FORNECEDORES WHERE id_fornecedor = ?";
        PreparedStatement ps = null;

        try {
            ps = conn.getConnection().prepareStatement(sql);
            ps.setInt(1, id_fornecedor);
            ps.execute();
            ps.close();
            System.out.println("Conta deletada.");

        } catch (Exception e) {
            System.out.println("Conta não deletada.");

        }
    }

    public void updateFornecedor(String cell, String senha_acesso, int id_fornecedor) {

        String sql = "UPDATE FORNECEDORES SET CELL = ?, SENHA_ACESSO = ? WHERE id_fornecedor = ?";
        PreparedStatement ps = null;

        try {
            ps = conn.getConnection().prepareStatement(sql);
            ps.setString(1, cell);
            ps.setString(2, senha_acesso);
            ps.setInt(3, id_fornecedor);
            ps.execute();
            ps.close();
            System.out.println("Conta atualizada.");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Conta não atualizada.");

        }
    }
}
