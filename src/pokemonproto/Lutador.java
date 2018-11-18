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
public class Lutador extends Pokemon{
    
    private ArrayList<Ataque> fightingMove;
    
    public Lutador(){
        this.fightingMove=new ArrayList<>();
        this.setTipo("Lutador");
        this.fraquezas.add("Psiquico");
        this.fraquezas.add("Voador");
        this.resistencias.add("Inseto");
        this.resistencias.add("Pedra");
    }
    public Ataque getFightingMove(int i){
        return this.fightingMove.get(i);
    }
    public void chooseLastMoves(){
        this.bootUpFightingMove();
        this.setMove(this.getFightingMove((int)(Math.random()*100)%10), 2);
        do{
            this.setMove(this.getFightingMove((int)(Math.random()*100)%10), 3);
        }while(this.getMove(2).getNome().equals(this.getMove(3).getNome()));
        this.fightingMove.clear();
    }
    public void bootUpFightingMove(){
        Ataque aux;
        aux=new Ataque("Aura Sphere", "Lutador", 2, 80, 1.0);
        this.fightingMove.add(aux);
        aux=new Ataque("Focus Blast", "Lutador", 2, 120, 0.7);
        this.fightingMove.add(aux);
        aux=new Ataque("Secret Sword", "Lutador", 2, 85, 1.0);
        this.fightingMove.add(aux);
        aux=new Ataque("Vacuum Wave", "Lutador", 2, 40, 1.0);
        this.fightingMove.add(aux);
        aux=new Ataque("Superpower", "Lutador", 1, 120, 1.0);
        this.fightingMove.add(aux);
        aux=new Ataque("Sky Uppercut", "Lutador", 1, 85, 0.9);
        this.fightingMove.add(aux);
        aux=new Ataque("Rock Smash", "Lutador", 1, 40, 1.0);
        this.fightingMove.add(aux);
        aux=new Ataque("Karate Chop", "Lutador", 1, 50, 1.0);
        this.fightingMove.add(aux);
        aux=new Ataque("High Jump Kick", "Lutador", 1, 130, 0.9);
        this.fightingMove.add(aux);
        aux=new Ataque("Focus Punch", "Lutador", 1, 150, 1.0);
        this.fightingMove.add(aux);
    }
}
