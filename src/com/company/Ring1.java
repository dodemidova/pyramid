package com.company;

public class Ring1 implements RingInterface {
    RingInterface nextRing;

    public Ring1(RingInterface nextRing) {
        this.nextRing = nextRing;
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public String build() {
        if(nextRing != null){
            return nextRing.build() + "   0|0   \n";
        }else {
            return "   0|0   \n";
        }
    }

    @Override
    public boolean isCorrect() {
        return (nextRing == null);
    }
}
