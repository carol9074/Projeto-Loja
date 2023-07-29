package Classes;

import DAO.CategoriaDAO;
public class Categoria {

    private int id_categoria;
    private String nome;
    private String descricao;

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void categoriaProdtudo(Categoria produto){
        
        new CategoriaDAO().categoriaProduto(produto);
    }

}
