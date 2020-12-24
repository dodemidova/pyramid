package com.company;

import static java.lang.StrictMath.abs;

public class Ring {
    int size;
    Ring nextRing;

    public Ring(int size, Ring nextRing) {
        this.size = size;
        this.nextRing = nextRing;
    }

    public void build(){

        if(nextRing != null){
            this.nextRing.build();
        }

        for (int i = 0; i < abs(this.size - 4); i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < this.size; i++) {
            System.out.print("O");
        }

        System.out.print("|");

        for (int i = 0; i < this.size; i++) {
            System.out.print("O");
        }

        for (int i = 0; i < abs(this.size - 4); i++) {
            System.out.print(" ");
        }
        System.out.print('\n');

    }

    public boolean isCorrect(){
        if(nextRing != null){
            return ((this.size - nextRing.size) == 1) && nextRing.isCorrect();
        }else{
            return this.size == 1;
            }
        }
    }
