/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package designpattern.Creational.builderpattern.onthii.vidu;

/**
 *
 * @author THIS PC
 */
public interface ComputerBuilder {
    ComputerBuilder setCPU(String CPU);
    ComputerBuilder setRAM(String RAM);
    ComputerBuilder setDisk(String DISK);
    ComputerBuilder setScreen(String Screen);
    Computer build();
}
