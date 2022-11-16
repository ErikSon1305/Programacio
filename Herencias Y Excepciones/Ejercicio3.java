public class Ejercicio3 {
    public static void main(String[] args) {
        int [] Array = new int[10];

        int count = Array.length;

        try {
            for (int i = 0; i < 11; i ++){
                System.out.println("array " + i + Array[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Se ha pasado de las dimensiones del array!!");
        }
    }
}
