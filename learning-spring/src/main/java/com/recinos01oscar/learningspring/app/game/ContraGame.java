package com.recinos01oscar.learningspring.app.game;

public class ContraGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println(" look up ");
    }

    @Override
    public void down() {
        System.out.println(" go down ");
    }

    @Override
    public void left() {
        System.out.println(" backing ");
    }

    @Override
    public void right() {
        System.out.println(" moving on  ");
    }

   
}
