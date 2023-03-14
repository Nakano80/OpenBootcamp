package com.tema7_8_9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // Cadena Invertida
        System.out.println("************Cadena Invertida************");
        Scanner scanner=new Scanner(System.in);
        String cadena;
        System.out.println("Ingresa la cadena de texto");
        cadena= scanner.nextLine();

        /*String cadenaInv="";
        for(int i=cadena.length()-1;i>=0;i--){
            cadenaInv+=cadena.charAt(i);
        }
        System.out.println(cadenaInv);*/
        StringBuilder reves=new StringBuilder(cadena);
        cadena=reves.reverse().toString();
        System.out.println(cadena);

        //1. Array Unidimensional
        System.out.println("\n************1. Array Unidimensional************");
        String[] array={"Perú", "Chile", "Brazil"};

        for(int i=0;i<array.length;i++){
            System.out.println("Posición ["+i+"] : "+array[i]);
        }

        //2. Array Bidimensional
        System.out.println("\n************2. Array Bidimensional************");
        int[][] arrayBid={{1,2,3},{4,5,6}};

       for(int i=0;i< arrayBid.length;i++){
           for(int j=0;j< arrayBid[i].length;j++){
               System.out.println("Posición ["+i+"]["+j+"] : "+arrayBid[i][j]);
           }
       }

       //3. Vector
        System.out.println("\n************3. Vector************");
        Vector<String> vector=new Vector<>();
        vector.add("Alex");
        vector.add("Cathy");
        vector.add("Israel");
        vector.add("Nicole");
        vector.add("Rex");
        System.out.println(vector);

        vector.remove(2);
        vector.remove(3);
        System.out.println(vector);

        //4. Problemas de utilizar Vector con capacidad por defecto.
        System.out.println("\n************4. Problemas de utilizar Vector con capacidad por defecto************");
        System.out.println("El problema es que existiría un desperdicio de memoria");


        //5. ArrayList/Linkedlist
        System.out.println("\n************ 5. ArrayList/Linkedlist ************");
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Tacna");
        arrayList.add("Arequipa");
        arrayList.add("Puno");
        arrayList.add("Moquegua");
        System.out.println("Esta es la lista de ArrayList: "+arrayList);

        LinkedList<String> linkedList=new LinkedList<String>();
        for(int i=0;i< arrayList.size();i++){
            linkedList.add(arrayList.get(i));
        }
        System.out.println("Esta es la lista de LinkedList: "+linkedList);

        //6. ArrayList
        System.out.println("\n************ 6. ArrayList ************");
        ArrayList<Integer> lista=new ArrayList<Integer>();
        for(int i=1; i<=10; i++){
            lista.add(i);
        }
        for(int j=0; j<lista.size(); j++){
            if(lista.get(j)%2==0) lista.remove(j);
        }
        System.out.println(lista);

        //7. DividePorCero
        System.out.println("\n************ 7. DividePorCero ************");

        System.out.println("Indica los numeros que quieres dividir: ");
        System.out.print("Numero 1: ");
        int a = scanner.nextInt();
        System.out.print("Numero 2: ");
        int b = scanner.nextInt();
        try {
            System.out.println("Resultado: " + (a/b));
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }


    }
}
