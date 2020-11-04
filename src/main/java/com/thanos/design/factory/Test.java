package com.thanos.design.factory;

/**
 * @author Shi Qiang Yu
 * @date 9/25/2020 4:44 PM
 */
public class Test {

    public static void main(String[] args) {

        Shape square = ShapeFactory.getShapeInstance("SQUARE");
        square.draw();

        Shape rectangle = ShapeFactory.getShapeInstance("RECTANGLE");
        rectangle.draw();
    }
}
