import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero {
    public static void main(String[] args) {

        LeerFichero accediendo = new LeerFichero();

        accediendo.leer();;

    }
}

class LeerFichero {

    public void leer(){

        try {
            FileReader entrada = new FileReader("fichero.txt");

            int c = entrada.read();

            while ( c != -1){
                    c = entrada.read();
                    char letra = (char)c;

                System.out.printf("%c",letra);
            }

        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");

        }
    }


}
