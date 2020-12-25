package com.company;

public class Ring4 implements RingInterface {
    RingInterface nextRing;

    public Ring4(RingInterface nextRing) {
        this.nextRing = nextRing;
    }

    @Override
    public int getSize() {
        return 4;
    }

    @Override
    public String build() {
        if(nextRing != null){
            return nextRing.build() + "0000|0000\n";
        }else {
            return "0000|0000\n";
        }
    }

    @Override
    public boolean isCorrect() {
        return (nextRing!= null && nextRing.isCorrect() && this.getSize() > nextRing.getSize());
    }
}
