package grafica;

import catalog.Catalog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveButton  implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        Catalog catalog = new Catalog();
        catalog.save("C:/Users/Dan/Desktop/catalog.dat");
        JOptionPane.showConfirmDialog(null,"Catalog Salvat cu Succes");
    }
}
