package com.company;

public class Ring3 implements RingInterface {
    RingInterface nextRing;

    public Ring3(RingInterface nextRing) {
        this.nextRing = nextRing;
    }

    @Override
    public int getSize() {
        return 3;
    }

    @Override
    public String build() {
        if(nextRing != null){
            return nextRing.build() + " 000|000 \n";
        }else {
            return " 000|000 \n";
        }
    }

    @Override
    public boolean isCorrect() {
        return (nextRing!= null && nextRing.isCorrect() && (this.getSize() - nextRing.getSize()) == 1);
    }
}
