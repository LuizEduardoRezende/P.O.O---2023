
package lista_ex1;


public abstract class Calculadora {
    //atributos
    public double num1;
    public double num2;
    
    //construtores
    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
   
    //metodos
    
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    public double getSoma(){
        return num1 + num2;
    }
    
    public double getMenos(){
        return num1 - num2;
    }
    
    public double getMult(){
        return num1 * num2;
    }
    
    public double getDivisao(){
        return num1/num2;
    }
    
    
    
    
    
}
