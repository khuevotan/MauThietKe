/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.Bai3;

public class ShapeFactory {
    Shape shape;

    public ShapeFactory(Shape shape) {
        this.shape = shape;
    }

    ShapeFactory() {
    }

    public Shape createShape(ShapeType type) {
        if (type.equals(ShapeType.rectangle)) {
            shape = Rectangle.createInstance();
        } else if (type.equals(ShapeType.circle)) {
            shape = Circle.createInstance();
        } else {
            shape = Triangle.createInstance();
        }
        return shape;
    }
}
