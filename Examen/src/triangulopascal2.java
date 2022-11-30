import java.util.Scanner;

public class triangulopascal2 {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        int cantidad = 0;
        System.out.println("Ingrese la cantidad n que quiere calcular: ");
        cantidad = scanner.nextInt();
        int [] matriz;
        int[] a= new int[1];

        for (int i = 0; i < cantidad; i++){
            matriz = new int[i];
            for (int j = 0; j < i; j++){

                if(j==0 || j==(i-1)){
                    matriz[j]=1;
                }else{
                    matriz[j]=a[j]+a[j-1];
                }

                System.out.print(matriz[j]);
            }
            a=matriz;
            System.out.println();
        }



    }
}
