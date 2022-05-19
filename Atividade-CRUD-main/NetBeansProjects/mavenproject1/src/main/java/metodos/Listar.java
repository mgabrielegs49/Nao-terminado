/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import classes.Cliente;
import classes.Produto;
import java.util.ArrayList;

/**
 *
 * @author Maria Gabriele
 */
public class Listar {
    
    ArrayList<Produto> produtos = Produto.listar();
        
        for(Produto produto: produtos){
        String marca = produto.getMarca();
        double preco = produto.getPreco();
        int id = produto.getId();
        int quantidade = produto.getQuantidade();
        String modelo = produto.getModelo();
        
        System.out.print(marca preco id quantidade modelo);
        }
    
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
