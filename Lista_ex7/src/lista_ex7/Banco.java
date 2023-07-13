
package lista_ex7;
import java.util.List;

public class Banco {
    //atributos
    private List<ContaCorrente> contas;
    private ContaCorrente conta;
                          
    //contrutor
    public Banco(List<ContaCorrente> contas) {
        this.contas = contas;
    }
    
    public Banco(){
    }

    //metodos
    public void Saque(ContaCorrente conta, double valor){
        if(conta.getSaldo()>0 && valor<conta.getSaldo() + conta.getLimite())
            conta.setSaldo(conta.getSaldo()- valor);
    }
    
    public void Deposito(ContaCorrente conta, double valor){
        conta.setSaldo(conta.getSaldo()+ valor);
    }
    
    public void TransfContas(ContaCorrente conta1, ContaCorrente conta2, double valor){
        conta2.setSaldo(conta2.getSaldo()+valor);
        conta1.setSaldo(conta1.getSaldo()-valor);
    }

    public String getSaldo(ContaCorrente conta){
        return "Saldo:" + conta.getSaldo();
    }
    
    public String getExtrato(ContaCorrente conta){
        return "Extrato:" + conta.getMovimentacoes();
    }

    @Override
    public String toString() {
        return "Banco" + "contas=" + contas;
    }
  
}
