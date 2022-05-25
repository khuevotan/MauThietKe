/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.Bai3_thay.Bai3;

/**
 *
 * @author THIS PC
 */
public abstract class Shape {
    private String brush;
    private String paper;
    private String frame;

    public Shape() {
        this.brush = "brush";
        this.paper = "paper";
        this.frame = "frame";
    }

    public abstract String draw();

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getBrush() {
        return brush;
    }

    public String getPaper() {
        return paper;
    }

    public String getFrame() {
        return frame;
    }
    
    

    @Override
    public String toString() {
        return "Shape{" + "brush=" + brush + ", paper=" + paper + ", frame=" + frame + '}';
    }
}
