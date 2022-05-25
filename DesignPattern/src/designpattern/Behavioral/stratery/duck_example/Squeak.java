/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.stratery.duck_example;

/**
 *
 * @author THIS PC
 */
public class Squeak implements IQuackBehavior{

    @Override
    public String quack() {
       return "Quack Quack Quack";
    }
    
}
