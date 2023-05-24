package caigit;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIgit {

    private static final int PORCENTAJE_APROBACION = 75;

    public static void main(String[] args) {
        Dificultad dificultad = new Dificultad();
        TipoProblema problema = new TipoProblema();
        NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
        Scanner lector = new Scanner(System.in);
        int preguntasCorrectas = 0;
        int preguntasIncorrectas = 0;

        int preguntasTotales = 0;
        int respuesta;

        int nivelDificultad = dificultad.pedirNivelDificultad(lector);
        int tipoProblema = problema.pedirTipoProblema(lector);
        ComentarioPositivoAleatorio postivo = new ComentarioPositivoAleatorio();
        ComentarioNegativoAleatorio negativo = new ComentarioNegativoAleatorio();
        Reiniciar reiniciar = new Reiniciar();

        SecureRandom generadorAleatorio = new SecureRandom();

        while (preguntasTotales < 10) {
            int numero1 = numeroAleatorio.generarNumeroAleatorio(nivelDificultad, generadorAleatorio);
            int numero2 = numeroAleatorio.generarNumeroAleatorio(nivelDificultad, generadorAleatorio);
            int resultado;

            switch (tipoProblema) {
                case 1:
                    resultado = numero1 + numero2;
                    System.out.print(numero1 + " + " + numero2 + " = ? ");
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    System.out.print(numero1 + " - " + numero2 + " = ? ");
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    System.out.print(numero1 + " * " + numero2 + " = ? ");
                    break;
                case 4:
                    resultado = numero1 / numero2;
                    System.out.print(numero1 + " / " + numero2 + " = ? ");
                    break;
                case 5:
                    int operacionAleatoria = generadorAleatorio.nextInt(4) + 1;
                    switch (operacionAleatoria) {
                        case 1:
                            resultado = numero1 + numero2;
                            System.out.print(numero1 + " + " + numero2 + " = ? ");
                            break;
                        case 2:
                            resultado = numero1 - numero2;
                            System.out.print(numero1 + " - " + numero2 + " = ? ");
                            break;
                        case 3:
                            resultado = numero1 * numero2;
                            System.out.print(numero1 + " * " + numero2 + " = ? ");
                            break;
                        case 4:
                            resultado = numero1 / numero2;
                            System.out.print(numero1 + " / " + numero2 + " = ? ");
                            break;
                        default:
                            resultado = 0;
                            break;
                    }
                    break;
                default:
                    resultado = 0;
                    break;
            }

            respuesta = lector.nextInt();

            if (respuesta == resultado) {
                preguntasCorrectas++;
                System.out.println(postivo.obtenerComentarioPositivoAleatorio(generadorAleatorio));
            } else {
                System.out.println(negativo.obtenerComentarioNegativoAleatorio(generadorAleatorio));
                while (respuesta != resultado) {
                    System.out.print("Inténtalo nuevamente: ");
                    respuesta = lector.nextInt();
                }
                System.out.println(postivo.obtenerComentarioPositivoAleatorio(generadorAleatorio));
                preguntasIncorrectas++;
            }
            preguntasTotales++;
            
        }
          double porcentajeCorrectas = (preguntasCorrectas / 10.00) * 100;

            if (porcentajeCorrectas < PORCENTAJE_APROBACION) {
                System.out.println("Por favor pide ayuda adicional a tu instructor.");
            } else if (porcentajeCorrectas >=PORCENTAJE_APROBACION) {
                System.out.println("¡Felicidades, estás listo para pasar al siguiente nivel!");
                reiniciar.reiniciarPrograma(lector);
            }
   
    }
}