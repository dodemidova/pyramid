package com.company;

public class Pyramid{
    RingInterface firstRing;

    public Pyramid(RingInterface firstRing) {
        this.firstRing = firstRing;
    }

    public boolean isCorrect(){
        return firstRing.isCorrect();
    }

    public void build(){
        System.out.println(this.firstRing.build());
    }

}
