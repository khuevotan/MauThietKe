/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Structural.decoratorpattern.vidu;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage, String description) {
        super(beverage, description);
    }

    @Override
    public int cost() {
        return beverage.cost() + 3;
    } 
}
