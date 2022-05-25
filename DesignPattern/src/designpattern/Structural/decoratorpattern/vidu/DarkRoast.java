/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Structural.decoratorpattern.vidu;


public class DarkRoast extends Beverage{

    public DarkRoast(String description) {
        super(description);
    }

    @Override
    public int cost() {
       return 10;
    }
}
