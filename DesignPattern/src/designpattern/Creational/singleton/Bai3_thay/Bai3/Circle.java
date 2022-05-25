/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.Bai3_thay.Bai3;

/**
 *
 * @author THIS PC
 */
public class Circle extends Shape{

    private Circle() {
        super();
    }

    private static Circle instance;
    
    public static Circle getInstance() {
        if (instance == null) 
            instance = new Circle();
        return instance;
    }
    
    @Override
    public String draw() {
        return "Hinh tam giac duoc ve boi " + " " + getBrush() + " " + getPaper() + " " + getFrame();
    }
    
}
