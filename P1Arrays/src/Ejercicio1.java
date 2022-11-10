import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        //Primer Ejercicio
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pos = 0, neg = 0, cero = 0; //Contadores
        int i;

        //Leemos los valores por teclado y los guardamos en el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }

        // Se recorre el array para contar positivos, negativos y ceros
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }
        System.out.println("Positvos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);





    }
}
