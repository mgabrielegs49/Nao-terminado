/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import classes.Cliente;
import classes.Produto;
import java.util.ArrayList;
/**
 *
 * @author Aluno
 */
public class App {
   public static void main(String[] args){
        
       Produto produto = new Produto(10);
       
       Produto p = new Produto();
        p.setMarca("Post-it");
        p.setPreco(3.00);
        p.setQuantidade(5);
        p.setModelo("Bloco de Notas");
        p.adicionar();
        
        ArrayList<Produto> produtos = Produto.listar();
        for(Produto produto: produtos){
        String marca = produto.getMarca();
        double preco = produto.getPreco();
        int id = produto.getId();
        int quantidade = produto.getQuantidade();
        String modelo = produto.getModelo();
        
        System.out.print(marca preco id quantidade modelo);
        }

        Produto p = new Produto(1);
        p.setMarca("Post-it");
        p.setPreco(3.00);
        p.setQuantidade(5);
        p.setModelo("Bloco de Notas");
        p.atualizar();
        
        
        Produto p = new Produto(1);
        p.excluir();
        
        
        Cliente c = new Cliente();
        c.setNome("Marinalva");
        c.setEmail("marimari@bol.com");
        c.setIdade(34);
        c.setUsername("MariahTodaLindah");
        c.adicionar();
        
        ArrayList<Cliente>cliente = Cliente.listar();
        for(Cliente cliente: cliente){
            int id = cliente.getId();
            String nome = cliente.getNome();
            String email = cliente.getEmail();
            int idade = cliente.getIdade();
            String username = cliente.getUsername();
            
            System.out.print(id nome email idade username);
        }
        
    }
}
