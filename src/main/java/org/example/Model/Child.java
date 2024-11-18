package org.example.Model;

/* статический блок, выводящий на экран «Child:static 1»
нестатический блок, выводящий на экран «Child:instance 1»
статический блок, выводящий на экран «Child:static 2»
конструктор без параметров, выводящий на экран «Child:constructor»
конструктор c параметром Name, выводящий на экран «Child:name-constructor»
нестатический блок, выводящий на экран «Child:instance 2» */

public class Child extends Parent{

    static {
        System.out.println("Child:static 1");
    }

    {
        System.out.println("Child:instance 1");
    }

    static {
        System.out.println("Child:static 2");
    }

    public Child(){
        System.out.println("Child:constructor");
    }

    public Child(String name){
        super(name);
        System.out.println("Child:name-constructor");
    }

    {
        System.out.println("Child:instance 2");
    }
}
