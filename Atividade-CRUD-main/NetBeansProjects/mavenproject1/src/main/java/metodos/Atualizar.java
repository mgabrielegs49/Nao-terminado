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
public class Atualizar {
    
    Cliente c = new Cliente(1);
        c.setNome("Marinalva");
        c.setEmail("marimari@ifap.edu.br");
        c.setIdade(34);
        c.setUsername("MariahTodaLindah");
        c.atualizar();
    
    Produto p = new Produto(1);
        p.setMarca("Post-it");
        p.setPreco(3.00);
        p.setQuantidade(5);
        p.setModelo("Bloco de Notas");
        p.atualizar();
        
}
