package Classes;

import DAO.ClienteDAO;
import java.util.ArrayList;
import DAO.EnderecoDAO;

public class Endereco {

    private int id_endereco;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String UF;

    public int getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public void enderecoGeral(Endereco geral, int idcliente) {

        new EnderecoDAO().enderecoGeral(geral, idcliente);
    }

    public ArrayList<Endereco> find() {

        ArrayList<Endereco> lista = new ArrayList<>();
        lista = new EnderecoDAO().find();
        return lista;
    }

    public void removeEndereco(int id_endereco) {

        new EnderecoDAO().removeEndereco(id_endereco);
    }

    public void updateEndereco(String rua, String bairro,String cidade,String UF,int num, int id_endereco) {

        new EnderecoDAO().updateEndereco(rua, bairro, cidade, UF, num, id_endereco);
    }
}
