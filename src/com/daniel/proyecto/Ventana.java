package com.daniel.proyecto;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
    private JPanel pnlBase;
    private JPanel panelJson;
    private JButton button1;

    public Ventana() {
        setContentPane(pnlBase);
        setDefaultCloseOperation(3);
        pack();
        setVisible(true);
    }

    private void createUIComponents() {
        panelJson = new JPanel();
        panelJson.setLayout(new BoxLayout(panelJson, BoxLayout.Y_AXIS));
    }
}
