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
public class Pokedex {
    private ArrayList<Tipo> pokedex;
    public Pokedex(){
        pokedex=new ArrayList<Tipo>();
    }
    public void addNew(String nome, int id, String tipo, double peso, double altura, int atk, int def, int atkSp, int defSp, int vel){
        Tipo aux=new Tipo(tipo);
        aux.setId(id);
        aux.setNome(nome);
        aux.setAltura(altura);
        aux.setPeso(peso);
        aux.setAtaque(atk);
        aux.setDefesa(def);
        aux.setAtaqueSp(atkSp);
        aux.setDefesaSp(defSp);
        aux.setVelocidade(vel);
        pokedex.add(aux);
    }
    public void print(){
        for(int i=0; i<pokedex.size(); i++){
            System.out.println("==============================");
            System.out.println("Nome: " + pokedex.get(i).getNome());
            System.out.println("Id: " + pokedex.get(i).getId());
            System.out.println("Tipo: " + pokedex.get(i).getTipo());
            System.out.println("Ataque: " + pokedex.get(i).getAtaque());
            System.out.println("Defesa: " + pokedex.get(i).getDefesa());
            System.out.println("Ataque especial: " + pokedex.get(i).getAtaqueSp());
            System.out.println("Defesa especial: " + pokedex.get(i).getDefesaSp());
            System.out.println("Velocidade: " + pokedex.get(i).getVelocidade());
            
        }
    }
}
