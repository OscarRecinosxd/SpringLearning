package com.oscarrecinos.learnframework02.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
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
