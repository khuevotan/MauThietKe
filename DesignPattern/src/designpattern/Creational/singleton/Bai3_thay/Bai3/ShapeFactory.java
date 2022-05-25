/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.Bai3_thay.Bai3;

/**
 *
 * @author THIS PC
 */
public class ShapeFactory {
    Shape createShape (ShapeType shapeType){
        if(shapeType == ShapeType.rectangle)
            return Rectangle.getInstance();
        if(shapeType == ShapeType.circle)
            return Circle.getInstance();
        if(shapeType == ShapeType.triangle)
            return Triangle.getInstance();
        return null;
    }
}
