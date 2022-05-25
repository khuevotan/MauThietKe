/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.Bai3_thay.Bai3;

/**
 *
 * @author THIS PC
 */
public class Triangle extends Shape{

    public Triangle() {
        super();
    }

    private static Triangle instance;
    
     public static Triangle getInstance() {
        if (instance == null) 
            instance = new Triangle();
        return instance;
    }
    
    @Override
    public String draw() {
        return "Hinh tron duoc ve boi " + " " + getBrush() + " " + getPaper() + " " + getFrame();
    }
    
}
