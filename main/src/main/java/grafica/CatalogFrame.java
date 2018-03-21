package grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class CatalogFrame {


    private static String[] stringList = new String[1000];
    private static JList jList;
    private static JTextField jTextField;
    private static JTextField jTextField2;
    private static JTextField jTextField3;
    private static JSpinner jSpinner;

    JFrame f = new JFrame();
    public void setVisible(Boolean ok) {
        if(ok==true)
        container();
    }


    public void changeString(int position,String string)
    {
        stringList[position]=string;

    }
    public String getTitle()
    {
        return jTextField.getText();
    }
    public String getPath()
    {
        return jTextField2.getText();
    }
    public String getAuthor()
    {
        return jTextField3.getText();
    }
    public Integer getYear()
    {
        return (Integer)jSpinner.getValue();
    }

    public void container() {

            for(int i=0;i<1000;i++)
                stringList[i]="                                                                                ";
            f = new JFrame("Tema Laboratorul 5");



            f.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent){
                    System.exit(0);
                }
            });


        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,5,630,610);
        panel.setBackground(Color.lightGray);

        JLabel jLabel = new JLabel();
        jLabel.setText("Add document");
        jLabel.setBounds(13,5,120,10);

        panel.add(jLabel);

        JLabel jLabel2 = new JLabel();
        jLabel2.setText("Title of the document");
        jLabel2.setBounds(3,30,200,10);

        panel.add(jLabel2);

        jTextField = new JTextField(8);
        jTextField.setFont(jTextField.getFont().deriveFont(15));
        jTextField.setBounds(3, 50, 620, 27);

        panel.add(jTextField);

        JLabel jLabel3 = new JLabel();
        jLabel3.setText("Path in the local file system");
        jLabel3.setBounds(3,90,620,10);

        panel.add(jLabel3);

        jTextField2 = new JTextField(8);
        jTextField2.setFont(jTextField2.getFont().deriveFont(15));
        jTextField2.setBounds(3, 110, 620, 27);

        panel.add(jTextField2);

        JLabel jLabel4 = new JLabel();
        jLabel4.setText("Publication Year");
        jLabel4.setBounds(3,150,620,10);

        panel.add(jLabel4);

        jSpinner = new JSpinner(new SpinnerNumberModel(1950, 1900, 2017, 1));
        jSpinner.setBounds(3,170,100,25);

        panel.add(jSpinner);

        JLabel jLabel5 = new JLabel();
        jLabel5.setText("Author");
        jLabel5.setBounds(3,210,620,10);

        panel.add(jLabel5);

        jTextField3 = new JTextField(8);
        jTextField3.setFont(jTextField3.getFont().deriveFont(15));
        jTextField3.setBounds(3, 230, 310, 27);

        panel.add(jTextField3);

        JButton jButton = new JButton("Add to repository");
        jButton.setBounds(3,270,170,30);

        panel.add(jButton);

        jList = new JList(stringList);
        jList.setVisibleRowCount(4);
        JScrollPane jScrollPane = new JScrollPane(jList);
        jScrollPane.setBounds(3,320,620,200);
        panel.add(jScrollPane);

        JButton jButton2 = new JButton("Add");
        jButton2.setBounds(73,530,70,30);
        panel.add(jButton2);

        JButton jButton3 = new JButton("Save");
        jButton3.setBounds(143,530,70,30);
        panel.add(jButton3);

        JButton jButton4 = new JButton("Load");
        jButton4.setBounds(213,530,70,30);
        panel.add(jButton4);

        JButton jButton5 = new JButton("Open");
        jButton5.setBounds(283,530,70,30);
        panel.add(jButton5);

        JButton jButton6 = new JButton("Report");
        jButton6.setBounds(353,530,100,30);
        panel.add(jButton6);

        JButton jButton7 = new JButton("List");
        jButton7.setBounds(453,530,70,30);
        panel.add(jButton7);


        JButton jButton8 = new JButton("Table List");
        jButton8.setBounds(500,230,120,30);
        panel.add(jButton8);

        ListButton listButton = new ListButton();
        jButton7.addActionListener(listButton);

        AddButton addButton = new AddButton();
        jButton2.addActionListener(addButton);

        SaveButton saveButton = new SaveButton();
        jButton3.addActionListener(saveButton);

        LoadButton loadButton = new LoadButton();
        jButton4.addActionListener(loadButton);

        OpenButton openButton = new OpenButton();
        jButton5.addActionListener(openButton);

        ReportButton reportButton = new ReportButton();
        jButton6.addActionListener(reportButton);

        Table table = new Table();
        jButton8.addActionListener(table);

        AddRepository addRepository = new AddRepository();
        jButton.addActionListener(addRepository);

        JButton jButton9 = new JButton("Tree");
        jButton9.setBounds(500,200,120,30);
        panel.add(jButton9);

        TreeButton treeButton = new TreeButton();
        jButton9.addActionListener(treeButton);

        JButton jButton10 = new JButton("Create Xml");
        jButton10.setBounds(500,170,120,30);
        panel.add(jButton10);

        CreateXmlButton createXmlButton = new CreateXmlButton();
        jButton10.addActionListener(createXmlButton);


        f.add(panel);
        f.setSize(660,660);
        f.setLayout(null);
        f.setVisible(true);


        stringList[0]=" Catalog Documents";





        }
    }

