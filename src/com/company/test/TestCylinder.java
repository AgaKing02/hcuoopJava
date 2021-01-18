package com.company.test;

import com.company.shapes.Cylinder;

public class TestCylinder {

    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + cylinder.getRadius()
                + " height=" + cylinder.getHeight()
                + " base area=" + cylinder.getArea()
                + " volume=" + cylinder.getVolume());

        Cylinder cylinder1 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " radius=" + cylinder1.getRadius()
                + " height=" + cylinder1.getHeight()
                + " base area=" + cylinder1.getArea()
                + " volume=" + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + cylinder2.getRadius()
                + " height=" + cylinder2.getHeight()
                + " base area=" + cylinder2.getArea()
                + " volume=" + cylinder2.getVolume());
    }

}