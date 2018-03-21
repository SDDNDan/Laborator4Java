package grafica;


import catalog.Catalog;
import documents.Document;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListButton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        Catalog catalog = new Catalog();
        catalog.load("C:/Users/Dan/Desktop/catalog.dat");
        CatalogFrame catalogFrame = new CatalogFrame();
        int contor=1;
        for(Document i : catalog.documentList)
        {
            String string = i.title + " " + i.pathList;
            catalogFrame.changeString(contor,string);
            contor++;
        }



    }
}
