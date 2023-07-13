
package lista_ex4;
//pronta
public class Main {

    public static void main(String[] args) {
       Veiculo v1 = new Veiculo("amarelo", 500, 2013, 40500);
       Motocicleta m1 = new Motocicleta("esporte", true, "vermelha", 120, 2020, 13000);
       Carro c1 = new Carro(true, true, "branco", 350, 2019, 35800);
       Caminhao cam1 = new Caminhao(7000, 40, "preto", 1300, 2008, 90000);
        
        System.out.println(v1);
        System.out.println(m1);
        System.out.println(c1);
        System.out.println(cam1);
          
    }
    
}
