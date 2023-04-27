package com.oscarrecinos.learnframework02.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    public GamingConsole game;

    public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
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
