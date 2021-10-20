package com.generation.ejercicio;

public class Person {

        private String name;
        private int age;
        private String id;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void mostrarDatos(){
            System.out.println( "Name: " + this.name);
            System.out.println( "Age: "+ this.age);
            System.out.println( "Id: " +  this.id);
        }
}
