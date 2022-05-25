/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.Bai3_thay.Bai3;

/**
 *
 * @author THIS PC
 */
public class Rectangle extends Shape{

    private Rectangle() {
        super();
    }
    
    private static Rectangle instance;
    
    public static Rectangle getInstance() {
        if (instance == null) 
            instance = new Rectangle();
        return instance;
    }
    
    @Override
    public String draw() {
        return "Hinh chu nhat duoc ve boi " + " " + getBrush() + " " + getPaper() + " " + getFrame();
    }
    
}
