/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.builderpattern.vidu.computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
        .addCPU("Core I9 12009")
        .addRAM("8 GB")
        .addDisk("120 TB")
        .addScreen("120in")
        .build();
        
        System.out.println(computer.toString());
    }
}
