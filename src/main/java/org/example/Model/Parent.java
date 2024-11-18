package org.example.Model;

/*
* приватное поле Name
статический блок, выводящий на экран «Model.Parent:static 1»
нестатический блок, выводящий на экран «Model.Parent:instance 1»
статический блок, выводящий на экран «Model.Parent:static 2»
конструктор без параметров, выводящий на экран «Model.Parent:constructor»
нестатический блок, выводящий на экран «Model.Parent:instance 2»
конструктор c параметром Name, выводящий на экран «Model.Parent:name-constructor»
*
* */

public abstract class Parent {
    private String name;

    static {
        System.out.println("Parent:static 1");
    }

    {
        System.out.println("Parent:instance 1");
    }

    static {
        System.out.println("Parent:static 2");
    }

    public Parent(){
        System.out.println("Parent:constructor");
    }

    {
        System.out.println("Parent:instance 2");
    }

    public Parent(String name){
        this.name = name;
        System.out.println("Parent:name-constructor");
    }
}
