package Classes;

import DAO.ClienteDAO;
import DAO.ProdutosDAO;
import java.util.ArrayList;
public class Produtos {

    private int id_produto;
    private String nome;
    private String marca;
    private String tam;
    private int quantidade;
    private double valor;

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void produtosRoupas(Produtos roupas,int id_produtos){
        
        new ProdutosDAO().produtosRoupas(roupas, id_produtos);
    }
      public ArrayList<Produtos> find() {

        ArrayList<Produtos> lojas = new ArrayList<>();
        lojas = new ProdutosDAO().find();
        return lojas;
    }
        public void removeProduto(int id_produtos) {
        
        new ProdutosDAO().removeProduto(id_produtos);
    }
     public void updateProduto(int quantidade,double valor, int id_produtos) {
        
        new ProdutosDAO().updateProduto(quantidade, valor, id_produtos);
    }
    
}
