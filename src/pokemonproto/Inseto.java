/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonproto;

import java.util.ArrayList;
/**
 * Classe representando os Pokemons do tipo inseto.
 * 
 * @author Rômulo Santos
 * 
 * @version 2.3
 * 
 * @since 1.0
 */
public class Inseto extends Pokemon{
    /**
     * ArrayList contendo ataques do tipo inseto, 
     * a partir dos quais os dois ultimos ataques serão selecionados.
     */
    private ArrayList<Ataque> bugMove;
    /**
     * Construtor da classe.
     */
    public Inseto(){
        this.bugMove=new ArrayList<>();
        this.setTipo("Inseto");
        this.fraquezas.add("Fogo");
        this.fraquezas.add("Voador");
        this.fraquezas.add("Pedra");
        this.resistencias.add("Planta");
        this.resistencias.add("Lutador");
        this.resistencias.add("Rasteiro");
    }
    /**
     * Retorna um ataque do ArrayList de ataques do tipo inseto.
     * 
     * @param i int - Indice do ArrayList de ataques do tipo inseto.
     * @return Ataque - Ataque do ArrayList de ataques do tipo inseto.
     */
    public Ataque getBugMove(int i){
        return this.bugMove.get(i);
    }
    /**
     * Seleciona os 2 últimos ataques do Pokemon.
     */
    @Override
    public void chooseLastMoves(){
        this.bootUpBugMove();
        this.setMove(this.getBugMove((int)(Math.random()*100)%10), 2);
        do{
            this.setMove(this.getBugMove((int)(Math.random()*100)%10), 3);
        }while(this.getMove(2).getNome().equals(this.getMove(3).getNome()));
        this.bugMove.clear();
    }
    /**
     * Inicializa o ArrayList de ataques do tipo inseto.
     */
    public void bootUpBugMove(){
        Ataque aux;
        aux=new Ataque("Infestation", "Inseto", 2, 20, 1.0);
        this.bugMove.add(aux);
        aux=new Ataque("Polen Puff", "Inseto", 2, 90, 0.8);
        this.bugMove.add(aux);
        aux=new Ataque("Signal Beam", "Inseto", 2, 75, 0.8);
        this.bugMove.add(aux);
        aux=new Ataque("Silver Wind", "Inseto", 2, 60, 0.9);
        this.bugMove.add(aux);
        aux=new Ataque("Struggle Bug", "Inseto", 2, 50, 0.9);
        this.bugMove.add(aux);
        aux=new Ataque("MegaHorn", "Inseto", 1, 120, 0.7);
        this.bugMove.add(aux);
        aux=new Ataque("Bug Bite", "Inseto", 1, 60, 0.9);
        this.bugMove.add(aux);
        aux=new Ataque("Fury Cutter", "Inseto", 1, 40, 0.95);
        this.bugMove.add(aux);
        aux=new Ataque("X-Scissor", "Inseto", 1, 80, 0.8);
        this.bugMove.add(aux);
        aux=new Ataque("Lunge", "Inseto", 1, 80, 0.8);
        this.bugMove.add(aux);
    }
}
