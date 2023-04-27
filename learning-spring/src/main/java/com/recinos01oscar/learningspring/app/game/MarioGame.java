package com.recinos01oscar.learningspring.app.game;

public class MarioGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println(" Jump ");
    }

    @Override
    public void down() {
        System.out.println(" Sit ");
    }

    @Override
    public void left() {
        System.out.println(" Moving left ");
    }

    @Override
    public void right() {
        System.out.println(" Shooting  ");
    }

    
}
