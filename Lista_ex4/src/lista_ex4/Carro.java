
package lista_ex4;

public class Carro extends Veiculo{
    //atributos
    private boolean airbag;
    private boolean ABS;
    
    
    //contrutor
    public Carro(boolean airbag, boolean ABS, String cor, double potencia, int ano, double valor) {
        super(cor, potencia, ano, valor);
        this.airbag = airbag;
        this.ABS = ABS;
    }
    
   
    //metodos
    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean ABS) {
        this.ABS = ABS;
    }

    @Override
    public String toString() {
        return "cor=" + cor + ", potencia=" + potencia + ", ano=" + ano + ", valor=" + valor + "Carro{" + "airbag=" + airbag + ", ABS=" + ABS + '}';
    }
}
