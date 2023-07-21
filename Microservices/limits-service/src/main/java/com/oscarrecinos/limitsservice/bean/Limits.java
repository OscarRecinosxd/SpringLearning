package com.oscarrecinos.limitsservice.bean;

public class Limits {
    private int minimun;
    private int maximon;

    public Limits(int minimun, int maximon) {
        this.minimun = minimun;
        this.maximon = maximon;
    }
    public int getMinimun() {
        return minimun;
    }
    public void setMinimun(int minimun) {
        this.minimun = minimun;
    }
    public int getMaximon() {
        return maximon;
    }
    public void setMaximon(int maximon) {
        this.maximon = maximon;
    }
}
