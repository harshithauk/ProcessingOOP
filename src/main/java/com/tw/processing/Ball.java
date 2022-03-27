package com.tw.processing;

public class Ball {
    public static int diameter;
    private float positionX;
    private float positionY;
    private final int speed;
    public static int HEIGHT;

    public Ball(int speed) {
        this.positionX = 0;
        this.positionY = getPositionY();
        this.speed = speed + 1;
        diameter = 50;
    }

    public float getPositionX() {
        return positionX++ * speed;
    }

    public float getPositionY() {
        positionY = HEIGHT * ((float) speed / 5);
        return positionY;
    }
}
