import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        main();
    }
    private static void main() {

        int cantidad = 0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese la cantidad de veces que quiera que se repita el bucle:");
            cantidad = sc.nextInt();

        } catch (InputMismatchException e){
            System.out.println("Vuelva a introducir el numero, debe ser un numero entero!!\n");
            main();
        }
        int i = 0;
        int numero = 0;

        while (i != cantidad){

            try {
                System.out.println("Introduce un numero entero paras calcular la raiz cuadrada del mismo: ");
                numero = sc.nextInt();
                double resultado = Math.sqrt(numero);
                System.out.println("La raiz cuadrada de " + numero + " es: " + resultado);
            } catch (InputMismatchException e){
                System.out.println("El numero introducido no es un entero!!");
                main();
            }
        }

    }
}
