package com.thanos.designpattern.factory;

/**
 * @author Shi Qiang Yu
 * @date 9/25/2020 4:39 PM
 */
public class ShapeFactory {

    Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
