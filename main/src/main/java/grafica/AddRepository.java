package grafica;

import book.Book;
import catalog.Catalog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRepository implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        Catalog catalog = new Catalog();

        catalog.load("C:/Users/Dan/Desktop/catalog.dat");

        CatalogFrame catalogFrame = new CatalogFrame();
        Book article = new Book(catalogFrame.getTitle(),catalogFrame.getPath(),catalogFrame.getYear(),catalogFrame.getAuthor());
        catalog.documentList.add(article);

        catalog.save("C:/Users/Dan/Desktop/catalog.dat");
        JOptionPane.showConfirmDialog(null,"Document salvat cu succes");


    }
}
