/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.Bai3;

public class Triangle extends Shape {
    private static Triangle instance;

    protected Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    public static Triangle createInstance() {
      
        if (instance == null) {
            instance = new Triangle("Brush triangle", "Paper triangle", "Frame triangle");
        }
        return instance;
    }

    @Override
    public String draw() {
           return "Hinh tam giac duoc ve boi " + brush + paper + frame;
    }
}
