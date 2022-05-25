/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.stratery.baitap1;


public class Main {
       public static void main(String[] args) {
       Context context = new Context();
        ITinh t = new Cong();
        ITinh t1 = new Tru();
        
        context.setTinhToan(t);
        System.out.println(context.tinhToan(75,12));
        context.setTinhToan(t1);
        System.out.println(context.tinhToan(54,78));
    }  
}
