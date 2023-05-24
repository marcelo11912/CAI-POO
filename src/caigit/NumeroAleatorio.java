
package caigit;

import java.security.SecureRandom;


public class NumeroAleatorio {
    public int generarNumeroAleatorio(int nivelDificultad, SecureRandom generadorAleatorio) {
        int maximo = (int) Math.pow(10, nivelDificultad) - 1;
        return generadorAleatorio.nextInt(maximo) + 1;
    }
}
