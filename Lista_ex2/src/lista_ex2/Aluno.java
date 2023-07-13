
package lista_ex2;

public class Aluno extends Pessoa{
    //atributos
    private String disciplina;
    private String curso;
    
    
    //construtores
    public Aluno(String disciplina, String curso, int cpf, String nome, String cidade) {
        super(cpf, nome, cidade);
        this.disciplina = disciplina;
        this.curso = curso;
    }
    
    //metodos

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
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
        return "Aluno{" + "disciplina=" + disciplina + ", curso=" + curso + ", cpf=" + this.cpf + ", nome=" + this.nome + ", cidade=" + this.cidade;
    }
     
}
