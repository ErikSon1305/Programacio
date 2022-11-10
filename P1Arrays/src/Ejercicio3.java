import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {

        //Ejercicio 2
        int matriz[] [] = new int[4][5];
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 5; col++) {
                matriz[fila][col] = col = (int) (Math.random() * 9);
                System.out.println(Arrays.deepToString(matriz));
            }
            //System.out.println(Arrays.deepToString(matriz[fila][col]));
        }

    }
}
