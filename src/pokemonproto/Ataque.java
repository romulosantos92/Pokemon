/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonproto;

/**
 *
 * @author romul
 */
public class Ataque {
    protected String nome;
    protected String tipo;
    protected int dano;
    protected double acuracia;
    protected String categoria;
    
    public Ataque(String nome, String tipo, int categoria, int dano, double acuracia){
        this.nome=nome;
        this.tipo=tipo;
        this.dano=dano;
        if(categoria==1)
            this.categoria="Fisico";
        else
            this.categoria="Especial";
        this.acuracia=acuracia;
        
    }
    public Ataque(String nome, int categoria, int dano, double acuracia){
        this.nome=nome;
        this.tipo="Normal";
        this.dano=dano;
        this.categoria="Especial";
        this.acuracia=acuracia;
    }
    public Ataque(String nome, int dano, double acuracia){
        this.nome=nome;
        this.tipo="Normal";
        this.dano=dano;
        this.categoria="Fisico";
        this.acuracia=acuracia;
    }

    public String getNome(){
        return this.nome;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getDano(){
        return this.dano;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public double getAcuracia(){
        return this.acuracia;
    }
    public void print(){
        System.out.println("==============================");
        System.out.println("Nome:     " + this.getNome());
        System.out.println("Tipo:     " + this.getTipo());
        System.out.println("Categoria:" + this.getCategoria());
        System.out.println("Dano:     " + this.getDano());
        System.out.println("Acuracia: " + this.getAcuracia()*100 + "%");
        System.out.println("");
    }
}
