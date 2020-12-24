package com.company;

public class Pyramid {
    Ring firstRing;

    public Pyramid(int ring1, int ring2, int ring3, int ring4) {
        this.firstRing = new Ring(ring1, new Ring(ring2, new Ring(ring3, new Ring(ring4, null))));
    }

    public Pyramid(int ring1, int ring2, int ring3) {
        this.firstRing = new Ring(ring1, new Ring(ring2, new Ring(ring3, null)));
    }

    public Pyramid(int ring1, int ring2) {
        this.firstRing = new Ring(ring1, new Ring(ring2, null));
    }

    public Pyramid(int ring1) {
        this.firstRing = new Ring(ring1, null);
    }

    public boolean isCorrect(){
        return this.firstRing.isCorrect();
    }

    public void build(){
        this.firstRing.build();
    }

}
