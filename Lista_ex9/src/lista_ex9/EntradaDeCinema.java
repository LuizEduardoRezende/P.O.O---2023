
package lista_ex9;

public class EntradaDeCinema {
    //atributos
    private Data data;
    private int sala;
    private double valor;
    
    
    //construtor
    public EntradaDeCinema(Data data, int sala, double valor){
        this.data = data;
        this.sala = sala;
        this.valor = valor;
    }

    //metodos
    public void CalculaDesconto(int idade) {
        if(idade < 12)
            this.valor *= 0.5 ; 
    }
    
    public void CalculaDesconto(int idade, int cartEstudante){
        if((idade <= 15)&&(idade >= 12))
            this.valor *= 0.6;
        
        if((idade <= 20)&&(idade >= 16))
            this.valor *= 0.7;
        
        if(idade > 20)
            this.valor *= 0.8;
    }
    
    public void CalculaDescontoHorario(){
        if(this.data.hora < 16)
            this.valor *= 0.9;
    }

    @Override
    public String toString() {
        return "EntradaDeCinema{" + "data=" + data + ", sala=" + sala + ", valor=" + valor + '}';
    }
    
}
