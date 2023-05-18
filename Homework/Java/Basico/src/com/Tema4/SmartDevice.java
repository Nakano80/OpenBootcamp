package com.Tema4;

public class SmartDevice {
    String marca;
    String modelo;
    String sistOp;
    Boolean linterna;

    public SmartDevice(){

    }

    public SmartDevice(String marca,String modelo, String sistOp, Boolean linterna) {
        this.marca = marca;
        this.modelo=modelo;
        this.sistOp = sistOp;
        this.linterna = linterna;
    }
}

class SmartPhone extends SmartDevice{
    int precio;

    public SmartPhone(){
        super();
    }

    public SmartPhone(String marca, String modelo, String sistOp, Boolean linterna, int precio) {
        super(marca, modelo, sistOp, linterna);
        this.precio = precio;
    }
}

class Smartwatch extends SmartPhone{
    String color;
    public Smartwatch(){
        super();
    }
   public Smartwatch(String marca, String modelo, String sistOp, Boolean linterna, int precio, String color) {
        super(marca, modelo, sistOp, linterna, precio);
        this.color=color;
    }
}
