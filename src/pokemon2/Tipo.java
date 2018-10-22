/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon2;

import java.util.ArrayList;

/**
 *
 * @author romul
 */
public class Tipo extends Pokemon{
    private String tipo;
    private ArrayList<String> ataques;
    private ArrayList<String> locais;
    
    public Tipo(String tipo){
        this.tipo=tipo;
        ataques=new ArrayList<String>();
        ataques.add("Ember");
        ataques.add("Flamethrower");
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public String getAtaques(int i){
        return this.ataques.get(i);
    }
    public void setAtaques(String s){
        this.ataques.add(s);
    }
}
