package Polymophism;

public class Main {
    public static void main(String[] args) {
        Person p = new Employee();
        p.name = "Odwa";
        System.out.println(p.getD());
       // Employee xx = (Employee)p;
        //xx.surname= "Mbombo";
        //System.out.println(xx.getD());

        //or

        ((Employee)p).surname = "Mbombo";

        System.out.println(p.getD());

    }
}
