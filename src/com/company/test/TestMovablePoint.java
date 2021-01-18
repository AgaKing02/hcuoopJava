package com.company.test;

import com.company.shapes.MovablePoint;

public class TestMovablePoint {

    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint.setSpeed(5, 5);
        movablePoint.move();
        System.out.println(movablePoint);
    }

}
