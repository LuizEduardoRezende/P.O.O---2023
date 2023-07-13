
package lista_ex9;
//pronto
public class Main {

    public static void main(String[] args){
        Data d1 = new Data(14,11,10,2004);
        EntradaDeCinema e1 = new EntradaDeCinema(d1,3,18.5);
        
        e1.CalculaDesconto(18);
        e1.CalculaDesconto(18, 890);
        e1.CalculaDescontoHorario();
        
        System.out.println(e1);
     
    }
    
}
