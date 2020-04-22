package com.example.oopproject;

public class Dog extends Animal {

    public void test(){
        super.sing(); //Super extend ettiğim sınıfa referans verir yani Animal'a
    }

    public void sing(){
        System.out.println("Dog class");
    }



}
