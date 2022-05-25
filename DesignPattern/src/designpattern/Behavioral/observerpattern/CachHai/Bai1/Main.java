/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.observerpattern.CachHai.Bai1;

public class Main {
    public static void main(String[] args) {
        Topic tp = new Topic();
        ThanhVienA khue = new ThanhVienA();
        ThanhVienB tan = new ThanhVienB();
        
        tp.attach(khue);
        tp.attach(tan);  
        System.out.println("----- Lần 1 -----");
        tp.addThongTin("Bài 1");
        
        tp.detach(khue); 
        System.out.println("----- Lần 2 -----");
        tp.addThongTin("Bài 2");
        tp.updateThongTin("Bài 2", "Bài 3");
    }
}
