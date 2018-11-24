/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonproto;

import java.util.ArrayList;
/**
 * Classe representando os Pokemons do tipo planta.
 * 
 * @author Rômulo Santos
 * 
 * @version 2.3
 * 
 * @since 1.0
 */
public class Planta extends Pokemon{
    /**
     * ArrayList contendo ataques do tipo planta, 
     * a partir dos quais os dois ultimos ataques serão selecionados.
     * 
     */
    private ArrayList<Ataque> grassMove;
    /**
     * Construtor da classe.
     */
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
    /**Retorna um ataque do ArrayList de ataques do tipo planta.
     * 
     * @param i int - Indice do ArrayList de ataques do tipo planta.
     * @return Ataque - Ataque do ArrayList de ataques do tipo planta.
     */
    public Ataque getGrassMove(int i){
        return this.grassMove.get(i);
    }
    /**
     * Seleciona os 2 últimos ataques do Pokemon.
     */
    @Override
    public void chooseLastMoves(){
        this.bootUpGrassMove();
        this.setMove(this.getGrassMove((int)(Math.random()*100)%10), 2);
        do{
            this.setMove(this.getGrassMove((int)(Math.random()*100)%10), 3);
        }while(this.getMove(2).getNome().equals(this.getMove(3).getNome()));
        this.grassMove.clear();
    }
    /**
     * Inicializa o ArrayList de ataques do tipo planta.
     */
    public void bootUpGrassMove(){
        Ataque aux;
        aux=new Ataque("Leaf Storm", "Planta", 2, 130, 0.65);
        this.grassMove.add(aux);
        aux=new Ataque("Solar Beam", "Planta", 2, 120, 0.6);
        this.grassMove.add(aux);
        aux=new Ataque("Grass Pledge", "Planta", 2, 80, 0.9);
        this.grassMove.add(aux);
        aux=new Ataque("Frenzy Plant", "Planta", 2, 150, 0.5);
        this.grassMove.add(aux);
        aux=new Ataque("Energy Ball", "Planta", 2, 90, 0.8);
        this.grassMove.add(aux);
        aux=new Ataque("Bullet Seed", "Planta", 1, 25, 0.9);
        this.grassMove.add(aux);
        aux=new Ataque("Leaf Blade", "Planta", 1, 90, 0.8);
        this.grassMove.add(aux);
        aux=new Ataque("Needle Arm", "Planta", 1, 60, 0.9);
        this.grassMove.add(aux);
        aux=new Ataque("Power Whip", "Planta", 1, 120, 0.7);
        this.grassMove.add(aux);
        aux=new Ataque("Vine Whip", "Planta", 1, 45, 0.9);
        this.grassMove.add(aux);
    }
}
