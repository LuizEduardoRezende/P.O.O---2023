
package lista_ex6;

public class Pessoa extends CadernoDeEnderecos{
    //atributos
    
    //construtor
    public Pessoa(String nome, int numero, String email, String aniversario, String endereco) {
        super(nome, numero, email, aniversario, endereco);
    }
     
    //metodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + this.nome + ", numero=" + this.numero + ", email=" + this.email + ", aniversario=" + this.aniversario + ", endereco=" + this.endereco + '}';
    }
}
