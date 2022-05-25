/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.builderpattern.onthii.vidu;

/**
 *
 * @author THIS PC
 */
public class Computer {
    String CPU, RAM, DISK, Screen;

    public Computer(String CPU, String RAM, String DISK, String Screen) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.DISK = DISK;
        this.Screen = Screen;
    }   

    @Override
    public String toString() {
        return "Computer{" + "CPU=" + CPU + ", RAM=" + RAM + ", DISK=" + DISK + ", Screen=" + Screen + '}';
    }
}
