/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonproto;

import java.util.ArrayList;
/**
 * Classe representando os Pokemons do tipo fogo.
 * 
 * @author Rômulo Santos
 * 
 * @version 2.3
 * 
 * @since 1.0
 */
public class Fogo extends Pokemon{
    /**
     * ArrayList contendo ataques do tipo fogo, 
     * a partir dos quais os dois ultimos ataques serão selecionados.
     */
    private ArrayList<Ataque> fireMove;
    /**
     * Construtor da classe.
     */
    public Fogo(){
        this.fireMove=new ArrayList<>();
        this.setTipo("Fogo");
        this.fraquezas.add("Agua");
        this.fraquezas.add("Rasteiro");
        this.fraquezas.add("Pedra");
        this.resistencias.add("Fogo");
        this.resistencias.add("Planta");
        this.resistencias.add("Gelo");
        this.resistencias.add("Inseto");
    }
    /**
     * Retorna um ataque do ArrayList de ataques do tipo fogo.
     * 
     * @param i int - Indice do ArrayList de ataques do tipo fogo.
     * @return Ataque - Ataque do ArrayList de ataques do tipo fogo.
     */
    public Ataque getFireMove(int i){
        return this.fireMove.get(i);
    }
    /**
     * Seleciona os 2 últimos ataques do Pokemon.
     */
    @Override
    public void chooseLastMoves(){
        this.bootUpFireMove();
        this.setMove(this.getFireMove((int)(Math.random()*100)%10), 2);
        do{
            this.setMove(this.getFireMove((int)(Math.random()*100)%10), 3);
        }while(this.getMove(2).getNome().equals(this.getMove(3).getNome()));
        this.fireMove.clear();
    }
    /**
     * Inicializa o ArrayList de ataques do tipo fogo.
     */
    public void bootUpFireMove(){
        Ataque aux;
        aux=new Ataque("Blaze Kick", "Fogo", 1, 150, 0.9);
        this.fireMove.add(aux);
        aux=new Ataque("Ember", "Fogo", 2, 40, 1.0);
        this.fireMove.add(aux);
        aux=new Ataque("Fire Fang", "Fogo", 1, 65, 0.95);
        this.fireMove.add(aux);
        aux=new Ataque("Flame wheel", "Fogo", 1, 60, 1.0);
        this.fireMove.add(aux);
        aux=new Ataque("Flamethrower", "Fogo", 2, 90, 1.0);
        this.fireMove.add(aux);
        aux=new Ataque("Incinerate", "Fogo", 2, 60, 100);
        this.fireMove.add(aux);
        aux=new Ataque("Sacred Fire", "Fogo", 1, 100, 0.95);
        this.fireMove.add(aux);
        aux=new Ataque("Mystical Fire", "Fogo", 2, 75, 1.0);
        this.fireMove.add(aux);
        aux=new Ataque("Magma Storm", "Fogo", 2, 100, 0.75);
        this.fireMove.add(aux);
        aux=new Ataque("Blast Burn", "Fogo", 2, 150, 0.9);
        this.fireMove.add(aux);
    }
}

