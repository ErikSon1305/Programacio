import java.util.Scanner;

public class triangulopascal {
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

        public static void main(String[] args) {
            // TODO code application logic here

            Scanner leer=new Scanner(System.in);
            System.out.println("Hasta que fila desea ver el triangulo de pascal: ");
            int nfilas=leer.nextInt();

            System.out.println(" ");
            int[] a= new int[1];
            int[] x;
            for(int i=0;i<=nfilas;i++){
                x = new int[i];
                for(int j=0;j<i;j++){
                    if(j==0 || j==(i-1)){
                        x[j]=1;
                    }else{
                        x[j]=a[j]+a[j-1];
                    }
                    System.out.print(x[j] + " ");
                }
                a=x;
                System.out.println();
            }
        }

    }

