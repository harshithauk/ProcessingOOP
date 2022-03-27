package com.tw.processing;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class TryProcessingOOP extends PApplet {

    List<Ball> ball = new ArrayList<>();

    public static void main(String[] args) {
        String[] appletArgs = new String[]{"com.tw.processing.TryProcessingOOP"};
        PApplet.main(appletArgs);
    }

    @Override
    public void setup() {
        super.setup();
        int HEIGHT = 480;
        int WIDTH = 640;
        Ball.HEIGHT = HEIGHT;
        size(WIDTH, HEIGHT);

        for (int i = 0; i < 4; i++) {
            ball.add(new Ball(i));
        }
    }

    @Override
    public void draw() {
        for (int i = 0; i < 4; i++) {
            drawCircle(ball.get(i));
        }
    }

    public void drawCircle(Ball b) {
        ellipse(b.getPositionX(), b.getPositionY(), Ball.diameter, Ball.diameter);
    }

}
