package grafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TreeButton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tree();
            }
        });

    }
}
