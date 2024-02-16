import java.util.AbstractList;
import java.util.Scanner;

/**
 * Programa de simulació de La Primitiva
 * @auhor //TODO: Nom Alumne
 * @version 1.0
 * @date //TODO: data
 */
//TODO: Fer refractor per canviar el nom de la classe
public class Primitiva {

    public static Scanner scanner = new Scanner(System.in);
    private static AbstractList<Object> numerosUsados;

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

    //Cambio
    private static void menuPrincipal(){
        System.out.println("***** PRIMITIVA ******");

        int[] aposta = introduirAposta();
        int[] combinacioGuanyadora = calcularCombinacioGuanyadora();
        int premi;

        if (combinacioGuanyadora != null) {
            System.out.println("La combinació ganadora és: ");

            for (int i = 0; i < combinacioGuanyadora.length - 1; i++) {
                System.out.print(combinacioGuanyadora[i] + " ");
            }

            System.out.println("Reintegrament " + combinacioGuanyadora[combinacioGuanyadora.length - 1]);
        }

        premi = comprovarEncerts(aposta, combinacioGuanyadora);
        System.out.println("El teu premi és: "+premi+" €");
    }

    /**
     * //TODO: Completasr
     * @return //TODO: Completar
     * @since 1.0
     */
    private static int[] introduirAposta() {
        System.out.println("Introdueix la teva aposta:");
        int[] aposta = new int[7];


        //Primeros 6 numeros generados
        for (int i = 0; i < 6; i++) {
            int numero;
            do {
                System.out.print("Introdueix el número: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Si us plau, introdueix un número enter vàlid.");
                    scanner.next();
                }
                numero = scanner.nextInt();
                if (numero < 1 || numero > 49) {
                    System.out.println("El número ha d'estar entre 1 i 49. Torna-ho a provar.");
                } else if (numerosUsados.contains(numero)) {
                    System.out.println("Aquest número ja ha estat introduït. Torna-ho a provar.");
                }
            } while (numero < 1 || numero > 49 || numerosUsados.contains(numero));

            aposta[i] = numero;
            numerosUsados.add(numero);
        }

        //Segundo numero generado
        System.out.print("Introdueix un número enter entre 0 i 9: ");
        int otronumero;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Si us plau, introdueix un número enter vàlid.");
                scanner.next();
            }
            otronumero = scanner.nextInt();
            if (otronumero < 0 || otronumero > 9) {
                System.out.println("El número ha d'estar entre 0 i 9. Torna-ho a provar.");
            }
        } while (otronumero < 0 || otronumero > 9);

        aposta[6] = otronumero;

        return aposta;
    }



    /**
     * //TODO: Completar
     * @return //TODO: Completar
     * @since 1.0
     */
    private static int[] calcularCombinacioGuanyadora(){
        int[] combinacio = null;

        //TODO: Fer el codi del mètode

        return combinacio;
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
