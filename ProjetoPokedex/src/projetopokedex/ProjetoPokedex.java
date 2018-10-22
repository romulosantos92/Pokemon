/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopokedex;

/**
 *
 * @author leoni
 */
public class ProjetoPokedex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pokedex dex = new Pokedex();
        Charmander ch = new Charmander();
        dex.addPkmn(ch);
        dex.printInfo(1);
        
        
    }
    
}
