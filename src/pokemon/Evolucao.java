/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author Luis Guilherme
 */
public class Evolucao {
    private String antecessor;
    private String sucessor;

    public Evolucao() {
    }

    public String getAntecessor() {
        return antecessor;
    }

    public void setAntecessor(String antecessor) {
        this.antecessor = antecessor;
    }

    public String getPosterior() {
        return sucessor;
    }

    public void setPosterior(String posterior) {
        this.sucessor = posterior;
    }

    
}
