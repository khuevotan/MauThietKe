/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.stratery.duck_example;

/**
 *
 * @author THIS PC
 */
public class VitXiem extends Duck{

    @Override
    public void display() {
        System.out.println("Toi la vit xiem, toi co the boi, bay, keu");
        performFly();
        performQuack();
    }
}
