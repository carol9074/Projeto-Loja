package Classes;

import DAO.ClienteDAO;
import DAO.EnderecoDAO;
import java.util.ArrayList;

public class Cliente {

    private int id_cliente;
    private String nome;
    private String cpf;
    private String email;
    private String cell;
    private String senha_acesso;

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getSenha_acesso() {
        return senha_acesso;
    }

    public void setSenha_acesso(String senha_acesso) {
        this.senha_acesso = senha_acesso;
    }

    public void cadastroCliente(Cliente dados) {

        new ClienteDAO().cadastroCliente(dados);
    }

    public ArrayList<Cliente> find() {

        ArrayList<Cliente> usuario = new ArrayList<>();
        usuario = new ClienteDAO().find();
        return usuario;
    }

    public Cliente FindByLogin(String email, String senha_acesso) {

        Cliente login = new Cliente();
        login = new ClienteDAO().FindByLogincliente(email, senha_acesso);

        return login;
    }

    public void FindByRemove(int id_cliente) {
        
        new ClienteDAO().FindByAndRemove(id_cliente);      
    }
     public void FindByUpdate(String cell,String senha_acesso, int id) {
        
        new ClienteDAO().FindByAndUpdate(cell, senha_acesso, id);
    }
}
