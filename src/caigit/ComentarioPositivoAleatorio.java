
package caigit;

import java.security.SecureRandom;


public class ComentarioPositivoAleatorio {
     public String obtenerComentarioPositivoAleatorio(SecureRandom generadorAleatorio) {
        String[] comentariosPositivos = {"¡Muy bien!", "¡Excelente!", "¡Buen trabajo!", "¡Sigue así!"};
        int indiceAleatorio = generadorAleatorio.nextInt(comentariosPositivos.length);
        return comentariosPositivos[indiceAleatorio];
    }
}
