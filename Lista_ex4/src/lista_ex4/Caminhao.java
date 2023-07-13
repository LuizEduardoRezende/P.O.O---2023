
package lista_ex4;

public class Caminhao extends Veiculo{
    //atributos
    private double peso;
    private double comprimento;
    
    //construtor
    public Caminhao(double peso, double comprimento, String cor, double potencia, int ano, double valor) {
        super(cor, potencia, ano, valor);
        this.peso = peso;
        this.comprimento = comprimento;
    }
    
    //metodos

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "cor=" + cor + ", potencia=" + potencia + ", ano=" + ano + ", valor=" + valor + "Caminhao{" + "peso=" + peso + ", comprimento=" + comprimento + '}';
    }
}
