/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.Bai3;

public abstract class Shape {
    protected String brush, paper, frame;

    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;  
    }

    public abstract String draw();

    @Override
    public String toString() {
        return "Shape: " + "brush=" + brush + ", paper=" + paper + ", frame=" + frame;
    }

}