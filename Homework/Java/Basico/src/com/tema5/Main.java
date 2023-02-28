package com.tema5;

public class Main {
    public static void main(String[] args) {
        CocheCRUD coche=new CocheCRUDImpl();

        coche.findAll();
        coche.save();
        coche.delete();

    }
}
