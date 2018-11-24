/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonproto;

import java.util.ArrayList;
/**
 * Classe representando os Pokemons do tipo venenoso.
 * 
 * @author Rômulo Santos
 * 
 * @version 2.3
 * 
 * @since 1.0
 */
public class Venenoso extends Pokemon{
    /**
     * ArrayList contendo ataques do tipo venenoso, 
     * a partir dos quais os dois ultimos ataques serão selecionados.
     * 
     */
    private ArrayList<Ataque> poisonMove;
    /**
     * Construtor da classe.
     */
    public Venenoso(){
        this.poisonMove=new ArrayList<>();
        this.setTipo("Venenoso");
        this.fraquezas.add("Rasteiro");
        this.fraquezas.add("Psiquico");
        this.resistencias.add("Planta");
        this.resistencias.add("Lutador");
        this.resistencias.add("Venenoso");
        this.resistencias.add("Inseto");
    }
    /**
     * Retorna um ataque do ArrayList de ataques do tipo venenoso.
     * 
     * @param i int - Indice do ArrayList de ataques do tipo venenoso.
     * @return Ataque - Ataque do ArrayList de ataques do tipo venenoso.
     */
    public Ataque getPoisonMove(int i){
        return this.poisonMove.get(i);
    }
    /**
     * Seleciona os 2 últimos ataques do Pokemon.
     * 
     */
    @Override
    public void chooseLastMoves(){
        this.bootUpPoisonMove();
        this.setMove(this.getPoisonMove((int)(Math.random()*100)%10), 2);
        do{
            this.setMove(this.getPoisonMove((int)(Math.random()*100)%10), 3);
        }while(this.getMove(2).getNome().equals(this.getMove(3).getNome()));
        this.poisonMove.clear();
    }
    /**
     * Inicializa o ArrayList de ataques do tipo venenoso.
     */
    public void bootUpPoisonMove(){
        Ataque aux;
        aux=new Ataque("Bubble Beam", "Eletrico", 2, 65, 1.0);
        this.poisonMove.add(aux);
        aux=new Ataque("Hydro Cannon", "Eletrico", 2, 150, 0.9);
        this.poisonMove.add(aux);
        aux=new Ataque("Surf", "Eletrico", 2, 90, 1.0);
        this.poisonMove.add(aux);
        aux=new Ataque("Water Gun", "Eletrico", 2, 40, 1.0);
        this.poisonMove.add(aux);
        aux=new Ataque("Whirlpool", "Eletrico", 2, 35, 0.85);
        this.poisonMove.add(aux);
        aux=new Ataque("Waterfall", "Eletrico", 1, 80, 100);
        this.poisonMove.add(aux);
        aux=new Ataque("Razor Shell", "Eletrico", 1, 75, 0.85);
        this.poisonMove.add(aux);
        aux=new Ataque("Dive", "Eletrico", 1, 80, 1.0);
        this.poisonMove.add(aux);
        aux=new Ataque("Clamp", "Eletrico", 1, 35, 0.85);
        this.poisonMove.add(aux);
        aux=new Ataque("Aqua Tail", "Eletrico", 1, 90, 0.9);
        this.poisonMove.add(aux);
    }
}
