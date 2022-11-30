import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio1_1 {


        public static void main(String [] arg) {
            File archivo = null;
            FileReader fr = null;
            ArrayList<String> lineas = new ArrayList<String>();
            try {
                archivo = new File("passwd.dat");
                String linea;
                fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                while((linea=br.readLine())!=null){
                    lineas.add(linea);
                }
                System.out.print ("EL VECTOR ES : \n ");//MOSTRAR LOS DATOS DEL ARREGLO
                for (int j = 0 ; j < lineas.size() ; j++){
                    linea = lineas.get(j);
                    System.out.print ( linea + "\n" );
                }
            }//FIN DEL TRY
            catch(IOException e){
                System.out.println(e);
            }
            finally{
                try{ //el bloque finally se ejecuta siempre, por eso, si se cierra el fichero
                    if( fr != null){ //al final del primer try, y ha dado un error antes, pasaría
                        fr.close(); //al 1er catch y luego saldría, dejándolo abierto. Es conveniente
                    } //cerrarlo aquí, comprobando que no sea -por un error anterior, como
                }catch (IOException e){ // no tener permisos de lectura o que no exista - de valor null.
                }
            }
            System.exit(0);}
    }

