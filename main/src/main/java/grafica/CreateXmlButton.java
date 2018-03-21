package grafica;

import catalog.Catalog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateXmlButton implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        Catalog catalog = new Catalog();
        catalog.load("C:/Users/Dan/Desktop/catalog.dat");

        CreateXml createXml = new CreateXml();
        try {
            createXml.write("C:/Users/Dan/Desktop/XmlMeu.xml",catalog);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
