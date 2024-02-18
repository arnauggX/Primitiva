import java.util.Scanner;
import java.util.Random;

/**
 * Programa de simulació de La Primitiva
 * @auhor //TODO: Nom Alumne
 * @version 1.0
 * @date //TODO: data
 */
//TODO: Fer refractor per canviar el nom de la classe
public class Primitiva {
    /**
     * Mètode main executable
     * @param args
     * @since 1.0
     */
    public static void main(String[] args) {
        menuPrincipal();
    }

    /**
     * //TODO: Completar
     * @since 1.0
     */
    private static void menuPrincipal(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("***** Loteria ******");
            System.out.println("1. Hacer apuesta");
            System.out.println("2. Girar el bombo");
            System.out.println("3. Juego nuevo");
            System.out.println("4. Salir");

            opcion = llegirInt("Seleccione una opción: ", 1, 4);

            switch (opcion) {
                case 1:
                    introduirAposta();
                    break;
                case 2:
                    int[] combinacion = calcularCombinacioGuanyadora();
                    System.out.println("La combinación ganadora es: ");
                    for (int i = 0; i < combinacion.length - 1; i++) {
                        System.out.print(combinacion[i] + " ");
                    }
                    System.out.println("Reintegrament " + combinacion[combinacion.length - 1]);
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    break;
            }

        } while (opcion != 4);
    }

    /**
     * //TODO: Completar
     * @return //TODO: Completar
     * @since 1.0
     */
    private static int[] introduirAposta(){
        System.out.println("Introdueix la teva aposta: ");
        int[] aposta = null;

        //TODO: Fer el codi del mètode

        return aposta;
    }

    /**
     * //TODO: Completar
     * @return //TODO: Completar
     * @since 1.0
     */

    private static int[] calcularCombinacioGuanyadora(){
        int[] combinacion = new int[7];
        Random random = new Random();

        // Generar 6 números aleatorios para la combinación principal
        for (int i = 0; i < 6; i++) {
            int numeroAleatorio;
            do {
                numeroAleatorio = random.nextInt(49) + 1;
            } while (estaRepetido(combinacion, numeroAleatorio, i));

            combinacion[i] = numeroAleatorio;
        }

        // Generar el número del reintegro (entre 0 y 9)
        combinacion[6] = random.nextInt(10);

        return combinacion;
    }

    private static boolean estaRepetido(int[] array, int numero, int longitud) {
        for (int i = 0; i < longitud; i++) {
            if (array[i] == numero) {
                return true;
            }
        }
        return false;
    }



    /**
     * //TODO: Completar
     * @param aposta //TODO: Completar
     * @param combinacioGuanyadora //TODO: Completar
     * @return //TODO: Completar
     * @since 1.0
     */
    private static int comprovarEncerts(int[] aposta, int[] combinacioGuanyadora){
        int premi = 0;
        int encerts = 0;
        boolean reintregrament = false;

        //Comprobar encerts a la combinació
        //TODO: Fer el codi del mètode


        //Comprobar reintegrament
        //TODO: Fer el codi del mètode

        //Calcular premi
        //TODO: Fer el codi del mètode

        return premi;
    }

    /**
     * Aquest mètode llegeix un enter per teclat dins d'un domini determinat
     * @param missatge parametritzat per a mostrar a l'usuari@
     * @param min valor min acceptat
     * @param max valor max acceptat
     * @return retorna un int
     * @since 1.0
     */
    private static int llegirInt(String missatge, int min, int max) {
        Scanner llegir = new Scanner(System.in);
        int x = 0;
        boolean valorCorrecte = false;
        do{
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();
            if (!valorCorrecte){
                System.out.println("ERROR: Valor no enter.");
                llegir.nextLine();
            }else{ // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max){
                    System.out.println("Opció no vàlida");
                    valorCorrecte = false;
                }
            }
        }while(!valorCorrecte);

        return x;
    }

    /**
     * Aquest mètode serveix per capturar floats des de teclat amb control d'errors
     * @param missatge
     * @return
     * @since 1.0
     */
    private static float llegirFloat(String missatge){
        Scanner llegir = new Scanner(System.in);
        float x = 0;
        boolean valorCorrecte = false;
        do{
            System.out.print(missatge);
            valorCorrecte = llegir.hasNextFloat();

            if (!valorCorrecte){
                System.out.println("ERROR: Valor no float.");
            }else{
                x = llegir.nextFloat();
            }
            llegir.nextLine();
        }while(!valorCorrecte);

        return x;
    }

}
