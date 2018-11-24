/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonproto;

import java.util.ArrayList;
/**
 *
 * @author romul
 */
public class Pokedex {
    
    private ArrayList<Pokemon> pokeList;
    
    public Pokedex(){
        this.pokeList=new ArrayList<>();
    }
    
    public Pokemon getPokemon(int i){
        return this.pokeList.get(i);
    }
    public int getSize(){
        return this.pokeList.size();
    }
    public void addPokemon(String nome, int id, String tipo, double peso, double altura, int atk, int def, int atkSp, int defSp, int vel){
        Pokemon pk;
        if ("Fogo".equals(tipo))
            pk=new Fogo();
        else if("Agua".equals(tipo))
            pk=new Agua();
        else if("Planta".equals(tipo))
            pk=new Planta();
        else if("Eletrico".equals(tipo))
            pk=new Eletrico();
        else if("Pedra".equals(tipo))
            pk=new Pedra();
        else if("Fantasma".equals(tipo))
            pk=new Fantasma();
        else if("Inseto".equals(tipo))
            pk=new Inseto();
        else if("Lutador".equals(tipo))
            pk=new Lutador();
        else if("Psiquico".equals(tipo))
            pk=new Psiquico();
        else if("Voador".equals(tipo))
            pk=new Voador();
        else if("Dragao".equals(tipo))
            pk=new Dragao();
        else if("Gelo".equals(tipo))
            pk=new Gelo();
        else if("Pedra".equals(tipo))
            pk=new Pedra();
        else if("Rasteiro".equals(tipo))
            pk=new Rasteiro();
        else if("Venenoso".equals(tipo))
            pk=new Venenoso();
        else
            pk=new Pokemon();
        
        pk.setNome(nome);
        pk.setId(id);
        pk.setPeso(peso);
        pk.setAltura(altura);
        pk.setAtaque(atk);
        pk.setDefesa(def);
        pk.setAtaqueSp(atkSp);
        pk.setDefesaSp(defSp);
        pk.setVelocidade(vel);
        
        this.pokeList.add(pk);
    }
    public void print(){
        for(int i=0; i<this.pokeList.size(); i++){
            this.pokeList.get(i).print();
        }
    }
    public void bootUpPokedex(){
        this.addPokemon("Bulbasaur", 1, "Planta", 6.9, 0.7, 3, 2, 3, 3, 3);
        this.addPokemon("Ivysaur", 2, "Planta", 13.0, 1.0, 3, 3,4, 3, 3);
        this.addPokemon("Venusaur", 3, "Planta", 100.0, 2.0, 4, 4, 5, 4, 4);
        this.addPokemon("Charmander", 4, "Fogo", 8.5, 0.6, 3, 2, 3, 2, 4);
        this.addPokemon("Charmeleon", 5, "Fogo", 19.0, 1.1, 3, 3, 4, 3, 4);
        this.addPokemon("Charizard", 6, "Fogo", 90.5, 1.7, 4, 3, 5, 4, 5);
        this.addPokemon("Squirtle", 7, "Agua", 9.0, 0.5, 3, 3, 2, 3, 2);
        this.addPokemon("Wartortle", 8, "Agua", 22.5, 1.0, 3, 4, 3, 3, 3);
        this.addPokemon("Blastoise", 9, "Agua", 85.5, 1.6, 4, 4, 4, 4, 4);
        this.addPokemon("Caterpie", 10, "Inseto", 2.9, 0.3, 2, 2, 1, 1, 3);
        this.addPokemon("Metapod", 11, "Inseto", 9.9, 0.7, 1, 3, 1, 1, 2);
        this.addPokemon("Butterfree", 12, "Inseto", 32.0, 1.1, 2, 2, 4, 3, 4);
        this.addPokemon("Weedle", 13, "Inseto", 3.2, 0.3, 2, 2, 1, 1, 3);
        this.addPokemon("Kakuna", 14, "Inseto", 10.0, 0.60, 1, 2, 1, 1, 2);
        this.addPokemon("Beedrill", 15, "Inseto", 29.5, 1.0, 5, 2, 2, 3, 4);
        this.addPokemon("Pidgey", 16, "Voador", 1.8, 0.3, 2, 2, 2, 2, 3);
        this.addPokemon("Pidgeotto", 17, "Voador", 30.0, 1.1, 3, 3, 2, 2, 4);
        this.addPokemon("Pidgeot", 18, "Voador", 39.5, 1.5, 4, 3, 3, 3, 5);
        this.addPokemon("Rattata", 19, "Normal", 3.5, 0.3, 3, 2, 1, 2, 4);
        this.addPokemon("Raticate", 20, "Normal", 18.5, 0.7, 4, 3, 2, 3, 5);
        this.addPokemon("Spearow", 21, "Voador", 2, 0.3, 3, 2, 2, 1, 4);
        this.addPokemon("Fearow", 22, "Voador", 38, 1.2, 5, 3, 3, 3, 5);
        this.addPokemon("Ekans", 23, "Venenoso", 6.9, 2, 3, 2, 2, 2, 3);
        this.addPokemon("Arbok", 24, "Venenoso", 65, 3.5, 4, 3, 3, 3, 4);
        this.addPokemon("Pikachu", 25, "Eletrico", 6, 0.4, 3, 2, 2, 2, 5);
        this.addPokemon("Raichu", 26, "Eletrico", 30, 0.8, 5, 3, 4, 3, 6);
        this.addPokemon("Sandshrew", 27, "Rasteiro", 12, 0.6, 4, 4, 1, 1, 2);
        this.addPokemon("Sandslash", 28, "Rasteiro", 29, 1, 5, 5, 2, 2, 4);
        this.addPokemon("Nidoran F", 29, "Venenoso", 7, 0.4, 3, 2, 2, 2, 2);
        this.addPokemon("Nidorina", 30, "Venenoso", 20, 0.8, 3, 3, 3, 2, 3);
        this.addPokemon("Nidoqueen", 31, "Venenoso", 60, 1.3, 5, 4, 4, 4, 4);
        this.addPokemon("Nidoran M", 32, "Venenoso", 9, 0.5, 3, 2, 2, 2, 3);
        this.addPokemon("Nidorino", 33, "Venenoso", 19.5, 0.9, 4, 3, 3, 2, 4);
        this.addPokemon("Nidoking", 34, "Venenoso", 62, 1.4, 5, 3, 4, 3, 5);
        this.addPokemon("Clefairy", 35, "Normal", 7.5, 0.6, 2, 2, 3, 3, 2);
        this.addPokemon("Clefable", 36, "Normal", 40, 1.3, 4, 3, 5, 4, 3);
        
    }
}
