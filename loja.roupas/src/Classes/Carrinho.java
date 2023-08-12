package Classes;

import DAO.CarrinhoDAO;
import java.util.ArrayList;

public class Carrinho {

    private int id_compras;
    public int quantidade;
    public String data_entrega;

    public int getId_compras() {
        return id_compras;
    }

    public void setId_compras(int id_compras) {
        this.id_compras = id_compras;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(String data_entrega) {
        this.data_entrega = data_entrega;
    }

    public void finalizarCarrinho(Carrinho compras) {

        new CarrinhoDAO().finalizarCarrinho(compras);
    }

    public ArrayList<Carrinho> find() {

        ArrayList<Carrinho> finalizar = new ArrayList<>();
        finalizar = new CarrinhoDAO().find();
        return finalizar;
    }

    public void updateCarrinho(int quantidade, int id_compras) {

        new CarrinhoDAO().updateCarrinho(quantidade, id_compras);
    }

    public void removeCarrinho(int id_carrinho, int id_produto) {

        new CarrinhoDAO().removeCarrinho(id_carrinho, id_produto);
    }

}
