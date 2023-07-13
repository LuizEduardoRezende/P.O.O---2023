
package lista_ex8;

import java.util.ArrayList;
import java.util.List;
//pronta
public class Main {

    public static void main(String[] args) {
        Pais brasil = new Pais("Brasil", "Brasilia", 4000);
        Pais brasil2 = new Pais("Brasil", "Brasilia", 4000);
        Pais argentina = new Pais("Argentina", "Buenos Aires", 2000);
        Pais uruguai = new Pais("Uruguai", "Montevideu", 1000);

        List<Pais> fronteiraBrasil = new ArrayList<>();
        fronteiraBrasil.add(argentina);
        fronteiraBrasil.add(uruguai);
        brasil.setFronteira(fronteiraBrasil);

        List<Pais> fronteiraArgentina = new ArrayList<>();
        fronteiraArgentina.add(brasil);
        fronteiraArgentina.add(uruguai);
        argentina.setFronteira(fronteiraArgentina);

        List<Pais> fronteiraUruguai = new ArrayList<>();
        fronteiraUruguai.add(brasil);
        fronteiraUruguai.add(argentina);
        uruguai.setFronteira(fronteiraUruguai);

        List<Pais> paisesEmComum = brasil.checkFronteira(argentina);
        List<Pais> paisesEmComum2 = brasil.checkFronteira(uruguai);
        List<Pais> paisesEmComum3 = argentina.checkFronteira(uruguai);
    
    
    
    
        System.out.println(brasil.equals(brasil2));
    
        System.out.println("\nPaises que fazem foronteira com Brasil e Argentina:" + "\n" + paisesEmComum);
        System.out.println("\nPaises que fazem foronteira com Brasil e Uruguai:" + "\n" + paisesEmComum2);
        System.out.println("\nPaises que fazem foronteira com Argentina e Uruguai:" + "\n" + paisesEmComum3);
        
   }
}
