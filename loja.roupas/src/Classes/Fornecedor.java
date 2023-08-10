
package Classes;

import DAO.FornecedorDAO;
import java.util.ArrayList;
public class Fornecedor {
    
    private int id_fornecedor;
    private String nome;
    private String cnpj;
    private String cell;
    private String email;
    private String senha_acesso;

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha_acesso() {
        return senha_acesso;
    }

    public void setSenha_acesso(String senha_acesso) {
        this.senha_acesso = senha_acesso;
    }
    public void fornecedorLoja(Fornecedor loja){
        
        new FornecedorDAO().fornecedorLoja(loja);
    }
      public ArrayList<Fornecedor> find() {

        ArrayList<Fornecedor> cadastro = new ArrayList<>();
        cadastro = new FornecedorDAO().find();
        return cadastro;
    }
      public Fornecedor FindByLogar(String email, String senha_acesso) {

        Fornecedor logar = new Fornecedor();
        logar = new FornecedorDAO().FindByLoginfornecedor(email, senha_acesso);

        return logar;
    }
       public void removeFornecedor(int id_fornecedor) {
        
        new FornecedorDAO().removeFornecedor(id_fornecedor);
    }
     public void updateFornecedor(String cell,String senha_acesso, int id_fornecedor) {
        
        new FornecedorDAO().updateFornecedor(cell, senha_acesso, id_fornecedor);
    }
    
}
