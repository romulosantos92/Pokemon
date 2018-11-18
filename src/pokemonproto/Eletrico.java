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
public class Eletrico extends Pokemon{
    
    private ArrayList<Ataque> electricMove;
    
    public Eletrico(){
        this.electricMove=new ArrayList<>();
        this.setTipo("Eletrico");
        this.fraquezas.add("Rasteiro");
        this.resistencias.add("Eletrico");
        this.resistencias.add("Voador");
    }
    public Ataque getElectricMove(int i){
        return this.electricMove.get(i);
    }
    public void chooseLastMoves(){
        this.bootUpElectricMove();
        this.setMove(this.getElectricMove((int)(Math.random()*100)%10), 2);
        do{
            this.setMove(this.getElectricMove((int)(Math.random()*100)%10), 3);
        }while(this.getMove(2).getNome().equals(this.getMove(3).getNome()));
        this.electricMove.clear();
    }
    public void bootUpElectricMove(){
        Ataque aux;
        aux=new Ataque("Bubble Beam", "Eletrico", 2, 65, 1.0);
        this.electricMove.add(aux);
        aux=new Ataque("Hydro Cannon", "Eletrico", 2, 150, 0.9);
        this.electricMove.add(aux);
        aux=new Ataque("Surf", "Eletrico", 2, 90, 1.0);
        this.electricMove.add(aux);
        aux=new Ataque("Water Gun", "Eletrico", 2, 40, 1.0);
        this.electricMove.add(aux);
        aux=new Ataque("Whirlpool", "Eletrico", 2, 35, 0.85);
        this.electricMove.add(aux);
        aux=new Ataque("Waterfall", "Eletrico", 1, 80, 100);
        this.electricMove.add(aux);
        aux=new Ataque("Razor Shell", "Eletrico", 1, 75, 0.85);
        this.electricMove.add(aux);
        aux=new Ataque("Dive", "Eletrico", 1, 80, 1.0);
        this.electricMove.add(aux);
        aux=new Ataque("Clamp", "Eletrico", 1, 35, 0.85);
        this.electricMove.add(aux);
        aux=new Ataque("Aqua Tail", "Eletrico", 1, 90, 0.9);
        this.electricMove.add(aux);
    }
}
