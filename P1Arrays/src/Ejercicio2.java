import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int numDni = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su numero del DNI sin la letra: ");
        numDni = sc.nextInt();

        char letra = letraDni(numDni);
        String dniConLetra = String.valueOf(numDni) + letra;
        System.out.println("Su DNI es: " + dniConLetra);


    }

    public static char letraDni(int numDni){
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            int resto = numDni % 23;

            char letra = letras.charAt(resto);
            return letra;

        }

}
