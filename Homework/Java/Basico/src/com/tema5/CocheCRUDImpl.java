package com.tema5;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Guardo un coche");
    }

    @Override
    public void findAll() {
        System.out.println("Muestro todos los coches");
    }

    @Override
    public void delete() {
        System.out.println("Elimino un coche");
    }
}
