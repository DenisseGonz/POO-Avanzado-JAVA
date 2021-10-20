package com.generation;

import com.generation.banco.CuentaBancaria;
import com.generation.ejercicio.Person;

public class Main {

    public static float numerador=10;
    public static int denominador=0;
    public static float division;

    //Modificador de acceso privado
    public static void main(String[] args) {

        System.out.println("Antes de hacer la división");
        try {
            division = numerador / denominador;
            System.out.println(division);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("Después de la división");
        }
        /*CuentaBancaria cuenta= new CuentaBancaria();
        cuenta.setNombre("Denisse González");
        cuenta.setClave("sdfgh6879");
        cuenta.setSaldo(300);
        System.out.println(cuenta.getNombre());
        cuenta.mostrarSaldo();
*/
      /*  Persona persona=new Persona();
        persona.nombre="Denisse";
        persona.edad=21;*/
        //Animal animal =new Animal();
        //animal.nombre ="Pejelagarto";

        /*Ejercicio
        Person person= new Person();
        person.setName("Santiago");
        person.setAge(33);
        person.setId("102045455");
        person.mostrarDatos();*/



    }
}
