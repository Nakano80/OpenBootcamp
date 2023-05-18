package com.Tema4;

public class Main {
    public static void main(String[] args) {

        SmartDevice smartDevice=new SmartDevice();
        SmartPhone smartPhone=new SmartPhone("Redmi","Note 11","Android",true,600);
       // Smartwatch smartwatch=new Smartwatch("Samsung","Galaxy","Android",false,350,"Blanco");

       // System.out.println("Celular: "+smartPhone.marca +" "+ smartPhone.modelo+"/ Precio: $"+smartPhone.precio +" Dólares");
       // System.out.println("SmartWatch: "+smartwatch.marca +" "+ smartwatch.modelo+"/ Precio: $"+smartwatch.precio +" Dólares y tiene un colo: "+smartwatch.color);


        Smartwatch smartwatch=new Smartwatch();

        smartwatch.modelo="Galaxy";
        System.out.println(smartwatch.modelo);
    }
}
