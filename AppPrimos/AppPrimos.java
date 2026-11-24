import java.util.ArrayList;
import java.util.List;

public class AppPrimos {

/**
 * Punto de entrada de la aplicación.
 * Calcula los números primos hasta un límite establecido
 * y muestra por pantalla el resultado y el tiempo de ejecución.
 *
 * @param args argumentos recibidos desde la línea de comandos
 */

    public static void main(String[] args) throws Exception {

        int limite = 10000;
        long inicio = System.nanoTime();
        List<Integer> primos = calcularPrimos(limite);
        long fin = System.nanoTime();

        System.out.println("Limite: " + limite);
        System.out.println("Numeros primos encontrados: " + primos.size());
        System.out.println("Tiempo de ejecucion: "
                + (fin - inicio) / 1_000_000 + " ms");
    }

/**
 * Calcula todos los números primos comprendidos entre 2 y el límite indicado.
 *
 * @param limite valor máximo hasta el que se buscan números primos
 * @return lista con todos los números primos encontrados
 */
    public static List<Integer> calcularPrimos(int limite) {

        List<Integer> primos = new ArrayList<>();
        for (int numero = 2; numero <= limite; numero++) {
            if (esPrimo(numero)) {
                primos.add(numero);
            }
        }
        return primos;
    }

/**
 * Comprueba si un número es primo mediante divisiones sucesivas.
 *
 * @param numero número entero que se desea comprobar
 * @return true si el número es primo; false en caso contrario
 */

    public static boolean esPrimo(int numero) {

        if (numero < 2) {
            return false;
        }

        for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
