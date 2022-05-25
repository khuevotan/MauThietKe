/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.Bai3;

public class Rectangle extends Shape {
    private static Rectangle instance;

    protected Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    public static Rectangle createInstance() {
        if (instance == null) {
            instance = new Rectangle("Brush rectangle", "Paper rectangle", "Frame rectangle");
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Hinh chu nhat duoc ve boi " + brush + paper + frame;
    }
}
