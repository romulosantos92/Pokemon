/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopokedex;

import java.util.ArrayList;

/**
 *
 * @author leoni
 */
public class Pokedex {
    ArrayList<Pokemon> pkmn;
    
    protected Pokedex(){
        this.pkmn = new ArrayList<Pokemon>();
    }
    protected int contaPokemons(){
        return pkmn.size();
    }
    protected void printInfo(int numero){
        for(int i =0; i<pkmn.size();i++){
            if(numero == pkmn.get(i).num ){
                System.out.println(pkmn.get(i).tipos);
                System.out.println(pkmn.get(i).num);
                System.out.println(pkmn.get(i).nome);
            
            }
        }
    }
    protected void printAlfabetico(){
        
    }
    protected void printInfo(String nome){
    
    }
    protected void printPorTipo(String tipo){
        
    }
    
    protected void preencheDex(){
        
    }
    
    protected void addPkmn(Pokemon pokemon){
        boolean add = pkmn.add(pokemon);
    }
    
}
