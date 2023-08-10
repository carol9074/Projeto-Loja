package Classes;

import java.util.ArrayList;
import Classes.Cliente;
import DAO.ClienteDAO;
import DAO.EnderecoDAO;
import DAO.FornecedorDAO;
import DAO.ProdutosDAO;

public class main {

    public static void main(String args[]) {

        //      ArrayList<Endereco> lista = new ArrayList<>();
//        Endereco e = new Endereco();
//
//        lista = e.find();
//
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println("Rua:" + lista.get(i).getRua());
//            System.out.println("Numero:" + lista.get(i).getNumero());
//            System.out.println("Bairro:" + lista.get(i).getBairro());
//            System.out.println("Cidade:" + lista.get(i).getCidade());
//            System.out.println("UF:" + lista.get(i).getUF());
//
//        }
//        System.out.println("______________________________");
//
//        ArrayList<Cliente> usuario = new ArrayList<>();
//        Cliente c = new Cliente();
//        usuario = c.find();
//        for (int i = 0; i < usuario.size(); i++) {
//            System.out.println("Nome:" + usuario.get(i).getNome());
//            System.out.println("CPF:" + usuario.get(i).getCpf());
//            System.out.println("Email:" + usuario.get(i).getEmail());
//            System.out.println("Celular:" + usuario.get(i).getCell());
//            System.out.println("Senha:" + usuario.get(i).getSenha_acesso());
//
//            System.out.println("______________________________");
//        }       
//        c = c.FindByLogin("carolainelopespereira9074@gmail.com", "carol123");
//        System.out.println("Bem-vindo " + c.getNome());
//
//        System.out.println("______________________________");
//        c.setNome("Leonardo");
//        c.setCpf("12345678900");
//        c.setEmail("leonardo8870@hotmail.com");
//        c.setCell("5551999903222");
//        c.setSenha_acesso("Leonardo123");
//        new ClienteDAO().cadastroCliente(c);
//        
//        
//        
//        e.setRua("Flores rosas");
//        e.setNumero(225);
//        e.setBairro("Centro");
//        e.setCidade("Paranagua");
//        e.setUF("PR");
//        Cliente c = new Cliente();
//        c.FindByRemove(3);
        // Cliente c = new Cliente();
        // c.FindByUpdate("123456789", "carolcarolcarol", 2);
        //  Endereco e = new Endereco();
        //  e.setRua("Paraíba");
        //  e.setNumero(914);
        //  e.setBairro("Nova Tramandai");
        // e.setCidade("Tramandai");
        //  e.setUF("Sp");
        //  e.enderecoGeral(e, 4);
        //  ArrayList<Endereco> lista = new ArrayList<>();
        //   lista = e.find();
        // for (int i = 0; i < lista.size(); i++) {
        //  System.out.println("Rua:" + lista.get(i).getRua());
        // System.out.println("Numero:" + lista.get(i).getNumero());
        // System.out.println("Bairro:" + lista.get(i).getBairro());
        // System.out.println("Cidade:" + lista.get(i).getCidade());
        //  System.out.println("UF:" + lista.get(i).getUF());
        // System.out.println("______________________________");
        //  Endereco e = new Endereco();
        // e.removeEndereco(2);
        //  e.updateEndereco("Sargento Geraldo Santana","São Francisco I", "Tramandai", "RS", 1240, 1);
       /* ArrayList<Fornecedor> cadastro = new ArrayList<>();
        Fornecedor f = new Fornecedor();
        cadastro = f.find();
        for (int i = 0; i < cadastro.size(); i++) {
            System.out.println("Nome:" + cadastro.get(i).getNome());
            System.out.println("CNPJ:" + cadastro.get(i).getCnpj());
            System.out.println("Celular:" + cadastro.get(i).getCell());
            System.out.println("Email:" + cadastro.get(i).getEmail());
            System.out.println("Senha:" + cadastro.get(i).getSenha_acesso());
            System.out.println("______________________________");
        }

      /*  f.setNome("Edison");
        f.setCnpj("12345678901235");
        f.setCell("5551999765424");
        f.setEmail("edison@gmail.com");
        f.setSenha_acesso("12354edison");
        new FornecedorDAO().fornecedorLoja(f);*/
     /* f = f.FindByLogar("edishow@gmail.com", "edison123546");
      System.out.println("Bem-vindo " + f.getNome());*/
    
      
      Produtos p = new Produtos();    
      p.setNome("Legin");
      p.setMarca("Lupo");
      p.setTam("M");
      p.setQuantidade(12);
      p.setValor(99.90);
      
      new ProdutosDAO().produtosRoupas(p, 2);
    }

}
