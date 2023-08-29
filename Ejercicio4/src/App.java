
/*Importamos el java.util.Scanner */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio Propuesto #14");
        System.out.println("Algoritmo que lee un n\u00FAmero y obtiene el cuadrado y su cubo");

        /*
         * Definimos la variable scanner de tipo Scanner para que registre las entradas
         */
        Scanner scanner = new Scanner(System.in);
        /* Pedimos al usuario digitar un número */
        System.out.print("Ingrese el número: ");
        /*
         * Definimos una variable entrada de tipo String que almacenará el dato de
         * entrada, en este caso el número
         */
        String entrada = scanner.nextLine();

        /*
         * Convertimos nuestra variable entrada de tipo String a double para realizar
         * las operaciones aritméticas
         */
        double numero = Double.parseDouble(entrada);
        /*
         * Utilizando el método Math.pow indicamos que a la variable numero se le
         * calcula la potencia b, primero b = 2 y luego b =3
         */
        System.out.println("El cuadrado es = " + Math.pow(numero, 2));
        System.out.println("El cubo es = " + Math.pow(numero, 3));

    }
}
