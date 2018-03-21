package grafica;

import catalog.Catalog;
import documents.Document;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class ReportButton implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        Catalog catalog = new Catalog();
        catalog.load("C:/Users/Dan/Desktop/catalog.dat");


       CreateExcel createExcel2 = new CreateExcel();
        try {
            createExcel2.createExcel();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (InvalidFormatException e1) {
            e1.printStackTrace();
        }


    }
}
