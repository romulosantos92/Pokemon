/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon2;

/**
 *
 * @author romul
 */
public class Main {
    public static void main(String[] args){
        Pokedex pokelist=new Pokedex(); 
        pokelist.addNew("Charmander", 004, "Fogo", 8.5, 0.6, 3, 2, 3, 2, 4);
        pokelist.addNew("Bulbasaur", 001, "Planta", 6.9, 0.7, 3, 2, 3, 3, 3);
        pokelist.addNew("Squirtle", 007, "Agua", 9.0, 0.5, 3, 3, 2, 3, 2);
        pokelist.print();
    }
    
}
