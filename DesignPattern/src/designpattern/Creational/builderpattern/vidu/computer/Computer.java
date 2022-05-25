/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.builderpattern.vidu.computer;

public class Computer {
    // cac thanh phan minh can khoi tao
    String CPU, RAM, Disk, screen; 

    public Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Disk = builder.Disk;
        this.screen = builder.screen;
    }

    @Override
    public String toString() {
        return "Computer{" + "CPU=" + CPU + ", RAM=" + RAM + ", Disk=" + Disk + ", screen=" + screen + '}';
    }
    
    public static class Builder{
        String CPU, RAM, Disk, screen; 
        
        public Builder addCPU(String CPU){
            this.CPU = CPU;
            return this;
        }
        
        public Builder addRAM(String RAM){
            this.RAM = RAM;
            return this;
        }
        
        public Builder addDisk(String Disk){
            this.Disk = Disk;
            return this;
        }
        
        public Builder addScreen(String screen){
            this.screen = screen;
            return this;
        }
        
        public Computer build(){
            return new Computer(this);
        }
    }
}
