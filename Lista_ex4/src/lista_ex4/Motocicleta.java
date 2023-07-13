
package lista_ex4;

public class Motocicleta extends Veiculo{
    //atributos
    private String tipo;
    private boolean bau;
    
    //construtor

    public Motocicleta(String tipo, boolean bau, String cor, double potencia, int ano, double valor) {
        super(cor, potencia, ano, valor);
        this.tipo = tipo;
        this.bau = bau;
    }
    
    //metodos

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isBau() {
        return bau;
    }

    public void setBau(boolean bau) {
        this.bau = bau;
    }

    @Override
    public String toString() {
        return "cor=" + cor + ", potencia=" + potencia + ", ano=" + ano + ", valor=" + valor + "Motocicleta{" + "tipo=" + tipo + ", bau=" + bau + '}';
    }
    
}
