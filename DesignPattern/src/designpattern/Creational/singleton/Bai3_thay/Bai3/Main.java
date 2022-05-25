/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.Bai3_thay.Bai3;

/**
 *
 * @author THIS PC
 */
public class Main {
    public static void main(String[] args) {
        Rectangle s1 = Rectangle.getInstance();
        Circle s2 = Circle.getInstance();

        System.out.println(s1.draw());
        System.out.println(s2.draw());
    }
}
