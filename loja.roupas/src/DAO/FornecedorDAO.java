package DAO;

import Classes.Fornecedor;
import conexao.conn;
import java.sql.PreparedStatement;

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
}
