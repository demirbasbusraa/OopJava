package com.example.oopproject;

public class Piano implements Instrument, HouseDecore {

    String brand;
    boolean digital;

    @Override
    public void info() {
        System.out.println("override method in piano");
    }
}
