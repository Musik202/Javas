package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Lugares.PRIMERO);
        System.out.println(Lugares.PRIMERO.ordinal());
        System.out.println(Lugares.PRIMERO.toString());

        System.out.println(Lugares.valueOf("PRIMERO"));


        Lugares[] lugar = Lugares.values();

        for (Lugares l: lugar) {

            System.out.println(l.ordinal()+1 + " )"  + l.name() + " -  " +  l.toString() );

        }

    }
}
