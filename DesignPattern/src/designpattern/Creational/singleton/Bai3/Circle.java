/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.Bai3;

public class Circle extends Shape {
    private static Circle instance;

    private Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    public static Circle createInstance() {
        if (instance == null) {
            instance = new Circle("Brush circle", "Paper circle", "Frame circle");
        }
        return instance;
    }

    @Override
    public String draw() {
          return "Hinh tron duoc ve boi " + brush + paper + frame;
    }
}