
package lista_ex7;
import java.util.List;

public class ContaCorrente {
    //atributos
    private int numero;
    private double saldo;
    private boolean special;
    private double limite;
    private List<Movimentacao> movimentacoes; 
       
    //costrutores
    public ContaCorrente(int numero, double saldo, boolean special, double limite, List<Movimentacao> movimentacoes) {
        this.numero = numero;
        this.saldo = saldo;
        this.special = special;
        this.limite = limite;
        this.movimentacoes = movimentacoes;
    }

    //metodos
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(List<Movimentacao> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "numero=" + numero + ", saldo=" + saldo + ", special=" + special + ", limite=" + limite + ", movimentacoes=" + movimentacoes + '}';
    }
    
    
    
    
}
