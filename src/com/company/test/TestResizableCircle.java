package com.company.test;

import com.company.shapes.ResizableCircle;

public class TestResizableCircle {

    public static void main(String[] args) {

        ResizableCircle resizableCircle = new ResizableCircle();
        System.out.println(resizableCircle);
        resizableCircle.resize(40);
        System.out.println(resizableCircle);

    }

}
