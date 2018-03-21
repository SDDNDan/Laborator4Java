package grafica;

import catalog.Catalog;
import documents.Document;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree extends JFrame{
    private JTree tree;
    public Tree()
    {
        Catalog catalog = new Catalog();
        catalog.load("C:/Users/Dan/Desktop/catalog.dat");
        //create the root node
        DefaultMutableTreeNode Documente = new DefaultMutableTreeNode("Documente");
        DefaultMutableTreeNode Titluri = new DefaultMutableTreeNode("Titluri");
        DefaultMutableTreeNode Autori = new DefaultMutableTreeNode("Autor");
        DefaultMutableTreeNode Pathuri = new DefaultMutableTreeNode("Pathu");
        DefaultMutableTreeNode Anul = new DefaultMutableTreeNode("An");
        //create the child nodes
        for(Document i : catalog.documentList)
        {
            DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode(i.title);
            Titluri.add(defaultMutableTreeNode);
            DefaultMutableTreeNode defaultMutableTreeNode2 = new DefaultMutableTreeNode(i.authors);
            defaultMutableTreeNode.add(defaultMutableTreeNode2);
            DefaultMutableTreeNode defaultMutableTreeNode3 = new DefaultMutableTreeNode(i.pathList);
            defaultMutableTreeNode.add(defaultMutableTreeNode3);
            DefaultMutableTreeNode defaultMutableTreeNode4 = new DefaultMutableTreeNode(i.year);
            defaultMutableTreeNode.add(defaultMutableTreeNode4);
        }

        Documente.add(Titluri);



        tree = new JTree(Documente);
        add(add(new JScrollPane(tree)));


        this.setTitle("JTree Example");
        this.pack();
        this.setVisible(true);


    }
}
