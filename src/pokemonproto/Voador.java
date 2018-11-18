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
public class Voador extends Pokemon{
    
    private ArrayList<Ataque> flyingMove;
    
    public Voador(){
        this.flyingMove=new ArrayList<>();
        this.setTipo("Voador");
        this.fraquezas.add("Eletrico");
        this.fraquezas.add("Gelo");
        this.fraquezas.add("Pedra");
        this.resistencias.add("Planta");
        this.resistencias.add("Lutador");
        this.resistencias.add("Inseto");
        this.inefetivo.add("Rasteiro");
    }
    public Ataque getFlyingMove(int i){
        return this.flyingMove.get(i);
    }
    public void chooseLastMoves(){
        this.bootUpFlyingMove();
        this.setMove(this.getFlyingMove((int)(Math.random()*100)%10), 2);
        do{
            this.setMove(this.getFlyingMove((int)(Math.random()*100)%10), 3);
        }while(this.getMove(2).getNome().equals(this.getMove(3).getNome()));
        this.flyingMove.clear();
    }
    public void bootUpFlyingMove(){
        Ataque aux;
        aux=new Ataque("Gust", "Voador", 2, 40, 1.0);
        this.flyingMove.add(aux);
        aux=new Ataque("Sky Attack", "Voador", 2, 140, 0.9);
        this.flyingMove.add(aux);
        aux=new Ataque("Oblivion Wing", "Voador", 2, 80, 1.0);
        this.flyingMove.add(aux);
        aux=new Ataque("Hurricane", "Voador", 2, 110, 0.7);
        this.flyingMove.add(aux);
        aux=new Ataque("Air slash", "Voador", 2, 75, 0.95);
        this.flyingMove.add(aux);
        aux=new Ataque("Aerial Ace", "Voador", 1, 60, 100);
        this.flyingMove.add(aux);
        aux=new Ataque("Air Cutter", "Voador", 1, 60, 0.95);
        this.flyingMove.add(aux);
        aux=new Ataque("Beak Blast", "Voador", 1, 100, 1.0);
        this.flyingMove.add(aux);
        aux=new Ataque("Drill Peck", "Voador", 1, 80, 1.0);
        this.flyingMove.add(aux);
        aux=new Ataque("Fly", "Voador", 1, 90, 0.95);
        this.flyingMove.add(aux);
    }
}
