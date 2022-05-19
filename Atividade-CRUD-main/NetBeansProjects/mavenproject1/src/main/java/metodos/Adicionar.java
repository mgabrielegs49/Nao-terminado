/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import classes.Cliente;
import classes.Produto;

/**
 *
 * @author Maria Gabriele
 */
public class Adicionar {
    Produto produto = new Produto(10);
       
       Produto p = new Produto();
        p.setMarca("Post-it");
        p.setPreco(3.00);
        p.setQuantidade(5);
        p.setModelo("Bloco de Notas");
        p.adicionar();
        
        Cliente c = new Cliente();
        c.setNome("Marinalva");
        c.setEmail("marimari@ifap.edu.br");
        c.setIdade(34);
        c.setUsername("MariahTodaLindah");
        c.adicionar();
        
        
}
