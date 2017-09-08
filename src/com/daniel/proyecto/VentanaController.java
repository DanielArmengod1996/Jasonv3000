package com.daniel.proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaController implements ActionListener {
    Ventana view;
    VentanaModel model;

    public VentanaController(Ventana view, VentanaModel model) {
        this.view = view;
        this.model = model;
    }

    public void addActionsListener(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
