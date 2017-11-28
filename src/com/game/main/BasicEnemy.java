package com.game.main;

import java.awt.*;

public class BasicEnemy extends GameObject {

    public BasicEnemy(int x, int y, ID id) {
        super(x,y,id);

        velX = 5;
        velY = 5;
    }

    public void tick(){
        x +=velX;
        y +=velY;

        if (y <= 0 || y + 48 >= Game.HEIGHT) {
            velY *= -1;
        }

        if (x <= 0 || x + 48 >= Game.WIDTH) {
            velX *= -1;
        }
    }
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x,y,32,32);
    }
}