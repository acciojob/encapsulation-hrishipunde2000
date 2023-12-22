package com.driver;

public class Main {

    public static void main (String[] args){
        RWOnly rwObject = new RWOnly();

        // Trying to access the private variable directly will result in a compilation error.
        // Uncommenting the line below will cause an error.
        //System.out.println(rwObject.name);

        rwObject.setName("Hrishi");

        System.out.println("Name: "+ rwObject.getName());

    }
}