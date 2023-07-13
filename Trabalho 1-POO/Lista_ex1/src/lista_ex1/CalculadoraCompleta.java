
package lista_ex1;

public class CalculadoraCompleta extends Calculadora{
    //atributos
    
 
    //construtores
    public CalculadoraCompleta(double num1, double num2) {
        super(num1, num2);
    }

    //metodos
    public double getRaiz(double num1){
        return Math.sqrt(num1);
    }
    
    public double getPotencia(double num1,double num2){
        return Math.pow(num1, num2);
    }

    @Override
    public String toString() {
        return String.format("Soma: %.2f Subtracao: %.2f Mult: %.2f Divisao: %.2f", getSoma(), getMenos(), getMult(), getDivisao());
    }
    
    
}
