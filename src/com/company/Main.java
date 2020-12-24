package com.company;

public class Main {

    public static void main(String[] args) {
	    Pyramid p1 = new Pyramid(4,3,2,1);
        System.out.println(p1.isCorrect());
        p1.build();
    }
}
