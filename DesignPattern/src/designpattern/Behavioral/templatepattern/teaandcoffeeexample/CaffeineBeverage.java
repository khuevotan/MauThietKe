/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.templatepattern.teaandcoffeeexample;

public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        System.out.println("Chuẩn bị công thức");
    }

    public void boilWater() {
        System.out.println("Nước sôi");
    }

    public void pourinCup() {
        System.out.println("Rót cốc");
    }
    
    public abstract void brew();
    public abstract void addCondiments();
    
    public final void showRecipe() {
        prepareRecipe();
        boilWater();
        brew();
        pourinCup();
        addCondiments();
    }
}
