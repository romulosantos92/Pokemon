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
public class Planta extends Pokemon{
    
    private ArrayList<Ataque> grassMove;
    
    public Planta(){
        this.grassMove=new ArrayList<>();
        this.setTipo("Planta");
        this.fraquezas.add("Fogo");
        this.fraquezas.add("Gelo");
        this.fraquezas.add("Veneno");
        this.fraquezas.add("Voador");
        this.fraquezas.add("Inseto");
        this.resistencias.add("Planta");
        this.resistencias.add("Agua");
        this.resistencias.add("Eletrico");
        this.resistencias.add("Rasteiro");
    }
    public Ataque getGrassMove(int i){
        return this.grassMove.get(i);
    }
    public void chooseLastMoves(){
        this.bootUpGrassMove();
        this.setMove(this.getGrassMove((int)(Math.random()*100)%10), 2);
        do{
            this.setMove(this.getGrassMove((int)(Math.random()*100)%10), 3);
        }while(this.getMove(2).getNome().equals(this.getMove(3).getNome()));
        this.grassMove.clear();
    }
    public void bootUpGrassMove(){
        Ataque aux;
        aux=new Ataque("Leaf Storm", "Planta", 2, 130, 0.9);
        this.grassMove.add(aux);
        aux=new Ataque("Solar Beam", "Planta", 2, 120, 1.0);
        this.grassMove.add(aux);
        aux=new Ataque("Grass Pledge", "Planta", 2, 80, 1.0);
        this.grassMove.add(aux);
        aux=new Ataque("Frenzy Plant", "Planta", 2, 150, 0.9);
        this.grassMove.add(aux);
        aux=new Ataque("Energy Ball", "Planta", 2, 90, 1.0);
        this.grassMove.add(aux);
        aux=new Ataque("Bullet Seed", "Planta", 1, 25, 1.0);
        this.grassMove.add(aux);
        aux=new Ataque("Leaf Blade", "Planta", 1, 90, 1.0);
        this.grassMove.add(aux);
        aux=new Ataque("Needle Arm", "Planta", 1, 60, 1.0);
        this.grassMove.add(aux);
        aux=new Ataque("Power Whip", "Planta", 1, 120, 0.85);
        this.grassMove.add(aux);
        aux=new Ataque("Vine Whip", "Planta", 1, 45, 1.0);
        this.grassMove.add(aux);
    }
}
