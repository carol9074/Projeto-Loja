
package Classes;

import DAO.FornecedorDAO;
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
    
}
