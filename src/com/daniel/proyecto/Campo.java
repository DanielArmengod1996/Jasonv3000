package com.daniel.proyecto;

public class Campo extends Objeto{
    public Campo(){

    }
    public enum Tipo{TEXTO, INTEGER, REAL, LISTA};
    public Tipo tipo;
    public String valor;

}
