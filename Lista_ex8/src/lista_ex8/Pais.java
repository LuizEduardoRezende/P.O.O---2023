
package lista_ex8;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    //atributos
    private String nome, capital;
    private double dimensao;
    private List<Pais> fronteira;
    
    //construtores
    public Pais(String nome, String capital, double dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
    }

    public Pais() {
    }
    
    //Métodos
    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public double getDimensao() {
        return dimensao;
    }
    
    public String equals(Pais outro){
        if((this.nome.equals(outro.nome) == true) && (this.capital.equals(outro.capital) == true))
            return "Os paises sao iguais";
        else
            return "Os paises nao sao iguais";
    }

    public void setFronteira(List<Pais> fronteira) {
        this.fronteira = fronteira;
    }

    public List<Pais> getFronteira() {
        return fronteira;
    }
    
    public List<Pais> checkFronteira(Pais outro) {
    List<Pais> vizinhosComuns = new ArrayList<>();
    if (fronteira != null && outro.getFronteira() != null) {
        for (Pais paisFronteira : fronteira) {
            if (outro.getFronteira().contains(paisFronteira)) {
                vizinhosComuns.add(paisFronteira);
            }
        }
    }
    return vizinhosComuns;
}

    @Override
    public String toString() {
        return "Nome:" + nome + "\nCapital:" + capital + "\nDimensao:" + dimensao + '\n';
    }
}