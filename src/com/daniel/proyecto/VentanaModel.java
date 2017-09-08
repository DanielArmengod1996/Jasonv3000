package com.daniel.proyecto;

import java.util.ArrayList;

public class VentanaModel {
    private ArrayList<Objeto> vObjetos;

    public VentanaModel(){
        vObjetos = new ArrayList<Objeto>();
        generarJSON();
    }

    //TODO comprobar si realmente merece la pena funcionar con objetos o simplemente realizar una relacion mediante un hashmap con id y valores de objetos
    //TODO guardando las relaciones en una tabla, la tabla clave y referencia
    private void generarJSON() {
        SubObjeto obj = new SubObjeto();
        obj.nombre = "OBJETOA";
        obj.vObjetos.add();
    }
}
