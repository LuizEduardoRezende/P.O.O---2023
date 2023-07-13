
package lista_ex7;

public class Movimentacao {
    //atributos
    private String descricao;
    private double valor;
    private int info;
    
    //construtor
    public Movimentacao(String descricao, double valor, int info) {
        this.descricao = descricao;
        this.valor = valor;
        this.info = info;
    }
    
    //metodos
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setInfo(int info) {
        this.info = info;
    }
    
    public String getInfo() {
        if(info>=1){
        return "Movimentacao de Credito";
        }else{
        return "Movimentacao de Debito";
        }
    }

    @Override
    public String toString() {
        return "Movimentacao{" + "descricao=" + descricao + ", valor=" + valor + ", info=" + info + '}';
    }
  
}
