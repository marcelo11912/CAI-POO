
package caigit;

import java.util.Scanner;


public class TipoProblema {
    public int pedirTipoProblema(Scanner lector) {
        System.out.println("Elige el tipo de problema aritmético a estudiar (1: suma, 2: resta, 3: multiplicación, 4: división, 5: mezcla): ");
        return lector.nextInt();
    }
}
