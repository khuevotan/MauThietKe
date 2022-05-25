/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.builderpattern.onthii.vidu;

public class Main {

    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerConcreteBuilder()
                .setCPU("Core I9 12009")
                .setRAM("8 GB")
                .setDisk("120 TB")
                .setScreen("120in");

        System.out.println(computerBuilder.build());
        System.out.println(computerBuilder.toString());
    }
}
