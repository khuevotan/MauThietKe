/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.observerpattern.mau.tigia;

public class Main {
    public static void main(String[] args) {
        TiGia f = new TiGia();
        NhaDauTuA a = new NhaDauTuA(f);
        NhaDauTuB b = new NhaDauTuB(f);
        
        System.out.println("Lan 1");
        f.notifyTiGia(0);
        a.huyDangKy(f);
        System.out.println("Lan 2");
        f.notifyTiGia(0);
    }
}
