package com.thanos.designpattern.factory;

/**
 * @author Shi Qiang Yu
 * @date 9/25/2020 4:38 PM
 */
public class Square implements Shape {

    @Override
    public void draw(){
        System.out.println("Inside Square::draw() method.");
    }
}
