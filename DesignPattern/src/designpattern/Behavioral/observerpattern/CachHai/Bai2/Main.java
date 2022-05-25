/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.observerpattern.CachHai.Bai2;

/**
 *
 * @author THIS PC
 */
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan khue = new TaiKhoan("Khuê", 1000, atm);
        TaiKhoan tuan = new TaiKhoan("Tuâ", 1500, atm);
        
        System.out.println("Giao dịch lần 1: ");
        khue.duaTheVaoATM();
        atm.rutTien(300);
        khue.rutThe();
        
        System.out.println("\nGiao dịch lần 2: ");
        tuan.duaTheVaoATM();
        atm.rutTien(500);
        
        System.out.println("\nGiao dịch lần 3: ");
        atm.rutTien(100);
        tuan.rutThe();
        
        System.out.println("\nGiao dịch lần 4: ");
        atm.rutTien(200);
    }
}
