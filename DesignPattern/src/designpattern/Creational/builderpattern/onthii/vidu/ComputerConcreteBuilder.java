/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.builderpattern.onthii.vidu;

/**
 *
 * @author THIS PC
 */
public class ComputerConcreteBuilder implements ComputerBuilder {
    String CPU, RAM, DISK, Screen;

    @Override
    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    @Override
    public ComputerBuilder setRAM(String RAM) {
       this.RAM = RAM;
       return this;
    }

    @Override
    public ComputerBuilder setDisk(String DISK) {
       this.DISK = DISK;
       return this;
    }

    @Override
    public ComputerBuilder setScreen(String Screen) {
        this.Screen = Screen;
        return this;
    }

    @Override
    public Computer build() {
       return new Computer(CPU, RAM, DISK, Screen);
    }
}
