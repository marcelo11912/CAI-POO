
package caigit;

import java.util.Scanner;


public class Dificultad {
    
      public int pedirNivelDificultad(Scanner lector) {
        System.out.println("Elige el nivel de dificultad (1: números de un dígito, 2: números de dos dígitos, etc.): ");
        return lector.nextInt();
    }
}
