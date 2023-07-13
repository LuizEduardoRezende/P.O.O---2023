
package lista_ex6;

public abstract class CadernoDeEnderecos{
    //atributos
    protected String nome;
    protected int numero;
    protected String email;
    protected String aniversario;
    protected String endereco;
    
    //construtor
    public CadernoDeEnderecos(String nome, int numero, String email, String aniversario, String endereco) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
        this.aniversario = aniversario;
        this.endereco = endereco;
    }
    
    //metodos

    @Override
    public String toString() {
        return "CadernoDeEnderecos{" + "nome=" + nome + ", numero=" + numero + ", email=" + email + ", aniversario=" + aniversario + ", endereco=" + endereco + '}';
    }
    
}
