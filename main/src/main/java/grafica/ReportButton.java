package grafica;

import catalog.Catalog;
import documents.Document;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ReportButton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Catalog catalog = new Catalog();
        catalog.load("C:/Users/Dan/Desktop/catalog.dat");

        for(Document i : catalog.documentList)
        {
            File file = new File(i.pathList);
            Desktop desktop = Desktop.getDesktop();

            try{
                desktop.open(file);
            }catch(Exception e3)
            {
                e3.printStackTrace();
            }
        }

    }
}
