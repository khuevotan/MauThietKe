/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Structural.adapterpattern.vidu;

/**
 *
 * @author THIS PC
 */
public class Main {

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        // Quấn một con chim vào một con chim
        // cư xử như con vịt đồ chơi

//        Trước: ToyDuck toyDuck = new PlasticToyDuck();
//        Sau: ToyDuck toyDuck = new BirdAdapter (sparrow);
        
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        // vịt đồ chơi cư xử như một con chim
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }
}
