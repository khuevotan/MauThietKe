/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.stratery.duck_example;


public class DuckExMain {
    
    public static void main(String[] args) {
        Duck duck = new VitXiem();
        IFlyBehavior flyBehavior = new FlyFly();
        IQuackBehavior quackBehavior = new Squeak();
        
        // lua chon cac hanh vi
        duck.setFlyBehavior(flyBehavior);
        duck.setQuackBehavior(quackBehavior);
        duck.display();
    }
}
