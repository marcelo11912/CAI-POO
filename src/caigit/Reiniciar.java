
package caigit;

import static caigit.CAIgit.main;
import java.util.Scanner;

public class Reiniciar {
    
     public void reiniciarPrograma(Scanner lector) {
        System.out.println("¿Deseas reiniciar el programa? (S/N)");
        String respuesta = lector.next();
        if (respuesta.equalsIgnoreCase("S")) {
            main(null);
        }
    }
}
