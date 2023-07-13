
package lista_ex3;
import java.util.ArrayList;
import java.util.List;
//pronto
public class Main {

    public static void main(String[] args) {
        Disciplina d1 = new Disciplina("Matematica");
        Disciplina d2 = new Disciplina("Portugues");
        
        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(d1);
        disciplinas.add(d2);
        
        Aluno a1 = new Aluno(disciplinas, "cc", 123, "luiz", "jatas");
        System.out.println(a1);
   
    }
    
}
