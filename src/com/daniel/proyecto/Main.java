package com.daniel.proyecto;

public class Main {
    public static void main(String... args){
        Ventana view = new Ventana();
        VentanaModel model = new VentanaModel();
        VentanaController controller = new VentanaController(view, model);
    }
}
