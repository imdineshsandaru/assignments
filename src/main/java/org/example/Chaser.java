package org.example;

public class Chaser {

    private int delay;
    private Double speed;

    public Chaser(int delay, Double speed) {
        this.delay = delay;
        this.speed = speed;
    }

    public int getDelay() {
        return delay;
    }

    public Double getSpeed() {
        return speed;
    }
}
