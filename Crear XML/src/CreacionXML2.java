import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class CreacionXML2 {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {

        // Creo una instancia de DocumentBuilderFactory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        // Creo un documentBuilder
        DocumentBuilder builder = factory.newDocumentBuilder();
        // Creo un DOMImplementation
        DOMImplementation implementation = builder.getDOMImplementation();

        Scanner sc = new Scanner(System.in);

        //Ingreso el nombre del documento XML que deseo
        System.out.println("Ingrese el nombre que desa que tenga el documento XML: ");
        String nombre = sc.nextLine();
        // Creo un documento con un elemento raiz asignando el nombre deseado
        Document documento = implementation.createDocument(null, nombre, null);
        documento.setXmlVersion("1.0");

        //Ingreso el nombre del elemento que deseo crear
        System.out.println("Ingrese el nombre del elemento: ");
        nombre = sc.nextLine();
        String nombreXml = nombre;
        // Creo los elementos
        Element elementoRaiz = documento.createElement(nombre);
        //Ingreso el nombre del elemento que deseo crear
        System.out.println("Ingrese el nombre del segundo elemento: ");
        nombre = sc.nextLine();

        Element elemento2 = documento.createElement(nombre);

        //Ingreso el nombre del elemento que deseo crear
        System.out.println("Ingrese el nombre del tercer elemento: ");
        nombre = sc.nextLine();
        // Creo elemento Matricula
        Element elemento3 = documento.createElement(nombre);
        //Ingreso el nombre del elemento que deseo crear
        System.out.println("Ingrese el dato del tercer elemento: ");
        nombre = sc.nextLine();
        Text textElemento1 = documento.createTextNode(nombre);
        // Declaramos que textElemento esta dentro del elemento Matricula
        elemento3.appendChild(textElemento1);


        //Ingreso el nombre del elemento que deseo crear
        System.out.println("Ingrese el nombre del cuarto elemento: ");
        nombre = sc.nextLine();
        // Creo elemento 4
        Element elemento4 = documento.createElement(nombre);
        System.out.println("Ingrese el dato del cuarto elemento: ");
        nombre = sc.nextLine();
        Text textElemento2 = documento.createTextNode(nombre);
        elemento4.appendChild(textElemento2);


        // Añado al elemento coches el elemento coche
        elementoRaiz.appendChild(elemento2);
        elemento2.appendChild(elemento3);
        elemento2.appendChild(elemento4);

        // Añado al root el elemento coches
        documento.getDocumentElement().appendChild(elemento2);

        // Asocio el source con el Document
        Source source = new DOMSource(documento);
        // Creo el Result, indicado que fichero se va a crear
        Result result = new StreamResult(new File(nombreXml+".xml"));

        // Creo un transformer, se crea el fichero XML
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.transform(source, result);

    }
}
