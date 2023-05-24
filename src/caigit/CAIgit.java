package caigit;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIgit {

    private static final int PORCENTAJE_APROBACION = 75;

    public static void main(String[] args) {
        Dificultad dificultad = new Dificultad();
        TipoProblema problema = new TipoProblema();
        Scanner lector = new Scanner(System.in);
        int preguntasCorrectas = 0;
        int preguntasIncorrectas = 0;

        int preguntasTotales = 0;
        int respuesta;

        int nivelDificultad = dificultad.pedirNivelDificultad(lector);
        int tipoProblema = problema.pedirTipoProblema(lector);
}
