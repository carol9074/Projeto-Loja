package Classes;
import DAO.CarrinhoDAO;

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
    public void finalizarCarrinho(Carrinho compras){
        
        new CarrinhoDAO().finalizarCarrinho(compras);
    }

   
    
    
}
