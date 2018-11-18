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
public class Agua extends Pokemon{
    
    private ArrayList<Ataque> waterMove;
    
    public Agua(){
        this.waterMove=new ArrayList<>();
        this.setTipo("Agua");
        this.fraquezas.add("Eletrico");
        this.fraquezas.add("Planta");
        this.resistencias.add("Agua");
        this.resistencias.add("Fogo");
        this.resistencias.add("Gelo");
    }
    public Ataque getWaterMove(int i){
        return this.waterMove.get(i);
    }
    public void chooseLastMoves(){
        this.bootUpWaterMove();
        this.setMove(this.getWaterMove((int)(Math.random()*100)%10), 2);
        do{
            this.setMove(this.getWaterMove((int)(Math.random()*100)%10), 3);
        }while(this.getMove(2).getNome().equals(this.getMove(3).getNome()));
        this.waterMove.clear();
    }
    public void bootUpWaterMove(){
        Ataque aux;
        aux=new Ataque("Bubble Beam", "Agua", 2, 65, 1.0);
        this.waterMove.add(aux);
        aux=new Ataque("Hydro Cannon", "Agua", 2, 150, 0.9);
        this.waterMove.add(aux);
        aux=new Ataque("Surf", "Agua", 2, 90, 1.0);
        this.waterMove.add(aux);
        aux=new Ataque("Water Gun", "Agua", 2, 40, 1.0);
        this.waterMove.add(aux);
        aux=new Ataque("Whirlpool", "Agua", 2, 35, 0.85);
        this.waterMove.add(aux);
        aux=new Ataque("Waterfall", "Agua", 1, 80, 100);
        this.waterMove.add(aux);
        aux=new Ataque("Razor Shell", "Agua", 1, 75, 0.85);
        this.waterMove.add(aux);
        aux=new Ataque("Dive", "Agua", 1, 80, 1.0);
        this.waterMove.add(aux);
        aux=new Ataque("Clamp", "Agua", 1, 35, 0.85);
        this.waterMove.add(aux);
        aux=new Ataque("Aqua Tail", "Agua", 1, 90, 0.9);
        this.waterMove.add(aux);
    }
}
