package grafica;

import article.Article;
import book.Book;
import catalog.Catalog;
import documents.Document;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;


public class CreateXml {

    public  void write(String path, Catalog catalog) throws Exception{


            try {
                DocumentBuilderFactory dbFactory =
                        DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                org.w3c.dom.Document doc = dBuilder.newDocument();

                // root element
                Element rootElement = doc.createElement("Catalog");
                doc.appendChild(rootElement);

                // supercars element
                Element supercar = doc.createElement("Documentele");
                rootElement.appendChild(supercar);

                for(Document i : catalog.documentList){

                    Element carname2 = doc.createElement("Titlul");
                    Attr attrType2 = doc.createAttribute("Titlu");
                    attrType2.setValue(i.title);
                    carname2.setAttributeNode(attrType2);
                    supercar.appendChild(carname2);


                    // carname element
                    Element carname = doc.createElement("Pathul");
                    Attr attrType = doc.createAttribute("Path");
                    attrType.setValue(i.pathList);
                    carname.setAttributeNode(attrType);
                    supercar.appendChild(carname);

                    if(i instanceof Book || i instanceof Article)
                    {
                        Element carname3 = doc.createElement("Anul");
                        Attr attrType3 = doc.createAttribute("An");
                        attrType3.setValue(i.year.toString());
                        carname3.setAttributeNode(attrType3);
                        supercar.appendChild(carname3);

                        Element carname4 = doc.createElement("Autorul");
                        Attr attrType4 = doc.createAttribute("Autor");
                        attrType4.setValue(i.authors.toString());
                        carname4.setAttributeNode(attrType4);
                        supercar.appendChild(carname4);
                    }





                }


                TransformerFactory transformerFactory = TransformerFactory.newInstance();

                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC,"yes");
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File("C:/Users/Dan/Desktop/rezultat.xml"));
                transformer.transform(source, result);

                // Output to console for testing
                StreamResult consoleResult = new StreamResult(System.out);
                transformer.transform(source, consoleResult);
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
}
