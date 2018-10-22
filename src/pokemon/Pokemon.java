/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import enums.ETipo;

/**
 *
 * @author Luis Guilherme
 */
public class Pokemon {
    
    private String nome;
    private ETipo tipo;
    private int numero;
    //private Evolucao evolucao;

    public Pokemon() {
    }    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ETipo getTipo() {
        return tipo;
    }

    public void setTipo(ETipo tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**public Evolucao getEvolucao() {
        return evolucao;
    }

    public void setEvolucao(Evolucao evolucao) {
        this.evolucao = evolucao;
    }**/
    

    @Override
    /**
     * Este método retorna os atributos da classe Pokemon
     */
    public String toString() {
        String str = "Nome: " + nome;
        str += "\nTipo: " + tipo;
        str += "\nNumero: " + numero;
        return str;
    }
}
