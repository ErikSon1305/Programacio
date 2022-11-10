import java.io.IOException;
import java.net.URL;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Iniciamos la clase que nos permite iniciar la "fábrica" de documentos XML
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {

            // Opcional, pero se recomienda para evitar ataques XXE (XML External Entities)
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            // Iniciamos DocumentBuilder para analizar un archivo XML
            DocumentBuilder db = dbf.newDocumentBuilder();

            // Abrimos el fichero y lo analizamos con db.parse
            URL url = new URL("https://www.xataka.com/sitemap_index.xml");

            // La normalización es opcional, pero recomendado para XML mal formateados
            // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            Document doc= db.parse(url.openStream());

            System.out.println("Elemento raiz :" + doc.getDocumentElement().getNodeName());
            System.out.println("------");

            // Obtenemos todos los staffs en una lista de nodos que podemos recorrer
            NodeList loc = doc.getElementsByTagName("loc");
            bucle1:
            for (int temp = 0; temp < loc.getLength(); temp++) {

                        // Iniciamos la clase que nos permite iniciar la "fábrica" de documentos XML
                        DocumentBuilderFactory dbf1 = DocumentBuilderFactory.newInstance();
                        try {

                            // Opcional, pero se recomienda para evitar ataques XXE (XML External Entities)
                            dbf1.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

                            // Iniciamos DocumentBuilder para analizar un archivo XML
                            DocumentBuilder db1 = dbf1.newDocumentBuilder();

                            // Abrimos el fichero y lo analizamos con db.parse
                            URL url1 = new URL(loc.item(temp).getTextContent());

                            // La normalización es opcional, pero recomendado para XML mal formateados
                            // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
                            Document doc1= db1.parse(url.openStream());

                            System.out.println("Elemento raiz :" + doc1.getDocumentElement().getNodeName());
                            System.out.println("------");

                            // Obtenemos todos los staffs en una lista de nodos que podemos recorrer
                            NodeList loc1 = doc1.getElementsByTagName("loc");

                            for (int temp1 = 0; temp1 < loc1.getLength(); temp1++) {
                                System.out.println(loc1.item(temp1).getTextContent());

                            }


                        } catch (ParserConfigurationException | SAXException | IOException e) {
                            e.printStackTrace();
                        }
                    }




        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}