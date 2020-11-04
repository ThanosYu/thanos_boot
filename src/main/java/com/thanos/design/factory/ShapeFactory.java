package com.thanos.design.factory;

/**
 * @author Shi Qiang Yu
 * @date 9/25/2020 4:39 PM
 */
class ShapeFactory {

    static Shape getShapeInstance(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
