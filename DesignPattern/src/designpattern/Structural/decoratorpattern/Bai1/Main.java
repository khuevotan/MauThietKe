/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Structural.decoratorpattern.Bai1;


public class Main {
    public static void main(String[] args) {
        BieuThuc bt1 = new BieuThucDonGian(1);
        bt1 = new Cong(bt1, 2);
        bt1 = new Cong(bt1, 3);
        bt1 = new TuyetDoi(bt1, -4);
        System.out.println(bt1.bieuThuc() + " = " + bt1.giaTri());
    }
}
