package grafica;

import catalog.Catalog;
import documents.Document;
import technical.manual.Manual;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Table extends JFrame implements ActionListener {

    public Table()
    {



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String[] columns = new String[] {
                "Titlu", "Path", "An", "Autor"
        };

        Catalog catalog = new Catalog();
        catalog.load("C:/Users/Dan/Desktop/catalog.dat");
        Object[][] data = new Object[200][200];
        int contor=0;
        for(Document i : catalog.documentList)
        {
            String title = i.title;
            String path = i.pathList;
            String an;
            String autor;
            if(i.year == null)
            {
                an = "Nu are";
            }
            else{
                an = i.year.toString();}
            if(i instanceof Manual)
            {
                autor = "Nu are";
            }
            else{
                autor = i.authors.get(0);}

            data[contor] = new Object[]{title,path,an,autor};
            contor++;
        }
        System.out.println(data);
        JTable table = new JTable(data, columns);
        this.add(new JScrollPane(table));

        this.setTitle("Catalog");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
