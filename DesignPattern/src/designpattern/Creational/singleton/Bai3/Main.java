/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.Bai3;

public class Main {
    public static void main(String[] args) {
        Shape shape;
        ShapeType chuNhat = ShapeType.rectangle;
        ShapeType hinhTron = ShapeType.circle;
        ShapeType tamGiac = ShapeType.triangle;
        
        
        ShapeFactory factory = new ShapeFactory();
        shape = factory.createShape(chuNhat);
        System.out.println("  " + shape.toString());
        shape = factory.createShape( hinhTron);
        System.out.println("  " + shape.toString());
        shape = factory.createShape(tamGiac);
        System.out.println("  " + shape.toString());
    }
}
