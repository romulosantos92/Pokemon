/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Guilherme
 */
public class Pokedex {
    
    private List<Pokemon> pkm;

    public Pokedex() {
        pkm = new ArrayList<Pokemon>();
    }
    /**
     * Este método adiciona um Pokemon à Pokedex
     * @param pokemon 
     */
    public void adicionaPokemon(Pokemon pokemon){
        pkm.add(pokemon);
    }
    /**
     * Este método remove um Pokemon da Pokedex
     * @param nome 
     */
    public void removePokemon(String nome){
        Pokemon pok = buscaPokemon(nome);
        if(pok != null){
            pkm.remove(pok);
        }
    }
    /**
     * Este método busca um Pokemon na Pokedex através de seu número
     * @param numero
     * @return 
     */
    public Pokemon buscaPokemon(int numero){
        Pokemon pok = null;
        for(Pokemon p: pkm){
            if(p.getNumero() == numero){
                pok = p;
            }
        }
        return pok;
    }    
    
    /**
     * Este método busca um Pokemon na Pokedex através de seu nome
     * @param nome
     * @return 
     */
    public Pokemon buscaPokemon(String nome){
        Pokemon pok = null;
        for(Pokemon p: pkm){
            if(p.getNome().equals(nome)){
                pok = p;
            }
        }
        return pok;
    }
    
    /**
     * Este método altera o nome de um Pokemon cadastrado na Pokedex
     * @param pokemon 
     */
    public void alteraPokemon(Pokemon pokemon){
        Pokemon pok = buscaPokemon(pokemon.getNumero());
        if(pok != null){
            int idx = pkm.indexOf(pok);
            pkm.set(idx, pokemon);
        }
    }
    /**
     * Este método retorna todos os Pokemon cadastrados na Pokedex
     * @return 
     */
    public List<Pokemon> listaPokemon(){
        return pkm;
    }
    /**
     * Este método conta quantos Pokemon existem na Pokedex
     * @return 
     */
    public int contaPokemon(){
        return pkm.size();
    }
    /**
     * Este método organiza os Pokemon cadastrados na Pokedex em ordem alfabética
     * @return 
     */
    public String ordemAlfabetica(){
        return "";
    }

    @Override
    /**
     * Este método retorna os atributos dos Pokemon cadastrados na Pokedex
     */
    public String toString() {
        String str = "--------------------\n";
        str += "Pokemon Cadastrados:\n";
        str += "--------------------\n";
        for(Pokemon p: pkm){
            str += p.toString() + "\n\n";
        }
        return str;
    }
    
    
    
    
}
