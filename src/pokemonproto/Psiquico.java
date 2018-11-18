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
public class Psiquico extends Pokemon{
    private ArrayList<Ataque> psychicMove;
    
    public Psiquico(){
        this.psychicMove=new ArrayList<>();
        this.setTipo("Psiquico");
        this.fraquezas.add("Fantasma");
        this.fraquezas.add("Inseto");
        this.resistencias.add("Psiquico");
        this.resistencias.add("Lutador");
    }
    public Ataque getPsychicMove(int i){
        return this.psychicMove.get(i);
    }
    public void chooseLastMoves(){
        this.bootUpWaterMove();
        this.setMove(this.getPsychicMove((int)(Math.random()*100)%10), 2);
        do{
            this.setMove(this.getPsychicMove((int)(Math.random()*100)%10), 3);
        }while(this.getMove(2).getNome().equals(this.getMove(3).getNome()));
        this.psychicMove.clear();
    }
    public void bootUpWaterMove(){
        Ataque aux;
        aux=new Ataque("Light That Burns the Sky", "Psiquico", 2, 200, 1.0);
        this.psychicMove.add(aux);
        aux=new Ataque("Myst Ball", "Psiquico", 2, 70, 1.0);
        this.psychicMove.add(aux);
        aux=new Ataque("Prismatic Laser", "Psiquico", 2, 160, 1.0);
        this.psychicMove.add(aux);
        aux=new Ataque("Psychic", "Psiquico", 2, 90, 1.0);
        this.psychicMove.add(aux);
        aux=new Ataque("PsyStrike", "Psiquico", 2, 100, 100);
        this.psychicMove.add(aux);
        aux=new Ataque("Zen Headbutt", "Psiquico", 1, 80, 0.9);
        this.psychicMove.add(aux);
        aux=new Ataque("Psycho Cut", "Psiquico", 1, 70, 1.0);
        this.psychicMove.add(aux);
        aux=new Ataque("Psychic Fangs", "Psiquico", 1, 85, 1.0);
        this.psychicMove.add(aux);
        aux=new Ataque("Heart Stamp", "Psiquico", 1, 60, 1.0);
        this.psychicMove.add(aux);
        aux=new Ataque("Confusion", "Psiquico", 1, 50, 1.0);
        this.psychicMove.add(aux);
    }
}
