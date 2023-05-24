
package caigit;

import java.security.SecureRandom;

public class ComentarioNegativoAleatorio {
    
   public String obtenerComentarioNegativoAleatorio(SecureRandom generadorAleatorio) {
        String[] comentariosNegativos = {"No. Por favor intenta de nuevo.", "Incorrecto. Intenta una vez más.", "¡No te rindas!", "No. Sigue intentando."};
        int indiceAleatorio = generadorAleatorio.nextInt(comentariosNegativos.length);
        return comentariosNegativos[indiceAleatorio];
    }
}
