
package lista_ex3;

public class Pessoa {
    //atributos
    public int cpf;
    public String nome;
    public String cidade;

    //contrutores
    public Pessoa(int cpf, String nome, String cidade) {
        this.cpf = cpf;
        this.nome = nome;
        this.cidade = cidade;
    }
    
    //metodos

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", nome=" + nome + ", cidade=" + cidade + '}';
    }
         
}
