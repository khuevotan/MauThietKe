/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoc.arayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THIS PC
 */
public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
            
        // lay mot phan tu trong list ra va gan kieu cho no
        Animal a = animals.get(0);
        animals.set(1, new Animal());
        
        // cac hanh dong pho bieb
        Animal[] arr = new Animal[5];
        animals.toArray(arr);
        
        System.out.println("Size of arraylist = " + animals.size());
        System.out.println("Size of array = " + arr.length);
    }
}
