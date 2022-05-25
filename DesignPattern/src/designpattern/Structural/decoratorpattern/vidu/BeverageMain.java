/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Structural.decoratorpattern.vidu;

public class BeverageMain {
   public static void main(String[] args) {
        Beverage b = new DarkRoast("Cafe so 1 the gioi");
        b = new Milk(b, "Sua ong tho");
        b = new Soy(b, "Sua dau nanh Vinamilk");
        b = new Milk(b, "Sua co gai Ha Lan");
        System.out.println("Mo ta: " + b.getDescription());
        System.out.println("Gia : " + b.cost());
    }
}
