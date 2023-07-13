
package lista_ex4;

public class Veiculo {
    //atributos
    protected String cor;
    protected double potencia;
    protected int ano;
    protected double valor;
    
    
    //contrutor
    public Veiculo(String cor, double potencia, int ano, double valor) {
        this.cor = cor;
        this.potencia = potencia;
        this.ano = ano;
        this.valor = valor;
    }
    
    //metodos
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "cor=" + cor + ", potencia=" + potencia + ", ano=" + ano + ", valor=" + valor + '}';
    }
}
