/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.templatepattern.teaandcoffeeexample;

/**
 *
 * @author THIS PC
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=====Caffee=====");
        CaffeineBeverage coffee = new Coffee();
        coffee.showRecipe();
        
        System.out.println();
        System.out.println("=====Tea=====");
        CaffeineBeverage Tea  = new Tea();
        Tea.showRecipe();

    }
}
