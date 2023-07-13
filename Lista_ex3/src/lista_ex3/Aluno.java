
package lista_ex3;
import java.util.List;

public class Aluno extends Pessoa{
    //atributos
    private List<Disciplina> disciplina;
    private String curso;
    
    
    //construtores
    public Aluno(List<Disciplina> disciplina, String curso, int cpf, String nome, String cidade) {
        super(cpf, nome, cidade);
        this.disciplina = disciplina;
        this.curso = curso;
    }

    //metodos
    public List<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return  "\nAluno:" + super.toString() + "\ncurso:" + curso + "\ndisciplina:" + disciplina;
    }
}
