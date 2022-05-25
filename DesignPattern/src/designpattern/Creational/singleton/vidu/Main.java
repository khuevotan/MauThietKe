/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.vidu;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.createInstance();
        Singleton s2 = Singleton.createInstance();

        s1.increase();
        s2.increase();
        s2.increase();
    }
}