package com.company;

public class Ring2 implements RingInterface {
    RingInterface nextRing;

    public Ring2(RingInterface nextRing) {
        this.nextRing = nextRing;
    }

    @Override
    public int getSize() {
        return 2;
    }

    @Override
    public String build() {
        if(nextRing != null){
            return nextRing.build() + "  00|00  \n";
        }else {
            return "  00|00  \n";
        }
    }

    @Override
    public boolean isCorrect() {
        return (nextRing!= null && nextRing.isCorrect() && (this.getSize() - nextRing.getSize()) == 1);
    }
}
