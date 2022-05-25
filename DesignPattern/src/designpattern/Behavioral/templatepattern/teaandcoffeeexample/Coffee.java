/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.templatepattern.teaandcoffeeexample;

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Pha cà phê xay");
    }

    @Override
    public void addCondiments() {
        System.out.println("Thêm đường và sữa");
    }

}
