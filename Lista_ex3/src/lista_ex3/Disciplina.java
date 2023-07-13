
package lista_ex3;

public class Disciplina {
    //atributos
    private String disciplina;
    
    //construtores
    public Disciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    //metodos
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return disciplina;
    }
}
