package com.openbootcamp;

public class Tema3 {
    public static void main(String[] args) {
        String[] nombres={"Alex","Paulo","Marco"};

       String concatena=null;

        for(int i=0;i< nombres.length;i++){
            concatena+=nombres[i]+" ";
        }
        System.out.println(concatena);
    }
}
