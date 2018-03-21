package grafica;

import catalog.Catalog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadButton implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        Catalog catalog = new Catalog();
        catalog.load("C:/Users/Dan/Desktop/catalog.dat");
        JOptionPane.showConfirmDialog(null,"Catalog Load cu Succes");
    }
}
