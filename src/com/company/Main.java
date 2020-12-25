package com.company;

public class Main {

    public static void main(String[] args) {
	    Pyramid p1 = new Pyramid(new Ring4(new Ring3(new Ring2(new Ring1(null)))));
        p1.build();
        System.out.println(p1.isCorrect());

        Pyramid p2 = new Pyramid(new Ring4(new Ring3(new Ring1(null))));
        p2.build();
        System.out.println(p2.isCorrect());

        Pyramid p3 = new Pyramid(new Ring4(new Ring3(new Ring2(null))));
        p3.build();
        System.out.println(p3.isCorrect());
    }
}
