package com.recinos01oscar.learningspring.app.game;

public class GameRunner {
    public GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("RUNNING THE GAME " + game );
        game.left();
        game.right();
        game.up();
        game.down();
    }
    
}
