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
public class Inseto extends Pokemon{
    
    private ArrayList<Ataque> bugMove;
    
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
    public Ataque getBugMove(int i){
        return this.bugMove.get(i);
    }
    public void chooseLastMoves(){
        this.bootUpBugMove();
        this.setMove(this.getBugMove((int)(Math.random()*100)%10), 2);
        do{
            this.setMove(this.getBugMove((int)(Math.random()*100)%10), 3);
        }while(this.getMove(2).getNome().equals(this.getMove(3).getNome()));
        this.bugMove.clear();
    }
    public void bootUpBugMove(){
        Ataque aux;
        aux=new Ataque("Infestation", "Inseto", 2, 20, 1.0);
        this.bugMove.add(aux);
        aux=new Ataque("Polen Puff", "Inseto", 2, 90, 1.0);
        this.bugMove.add(aux);
        aux=new Ataque("Signal Beam", "Inseto", 2, 75, 1.0);
        this.bugMove.add(aux);
        aux=new Ataque("Silver Wind", "Inseto", 2, 60, 1.0);
        this.bugMove.add(aux);
        aux=new Ataque("Struggle Bug", "Inseto", 2, 50, 1.0);
        this.bugMove.add(aux);
        aux=new Ataque("MegaHorn", "Inseto", 1, 120, 85);
        this.bugMove.add(aux);
        aux=new Ataque("Bug Bite", "Inseto", 1, 60, 1.0);
        this.bugMove.add(aux);
        aux=new Ataque("Fury Cutter", "Inseto", 1, 40, 0.95);
        this.bugMove.add(aux);
        aux=new Ataque("X-Scissor", "Inseto", 1, 80, 1.0);
        this.bugMove.add(aux);
        aux=new Ataque("Lunge", "Inseto", 1, 80, 1.0);
        this.bugMove.add(aux);
    }
}
