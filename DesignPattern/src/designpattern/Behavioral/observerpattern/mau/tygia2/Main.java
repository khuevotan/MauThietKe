/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.observerpattern.mau.tygia2;

/**
 *
 * @author THIS PC
 */
public class Main {
     public static void main(String[] args) {
        TyGia f = new TyGia();
        NhaDauTuA a = new NhaDauTuA();
        NhaDauTuB b = new NhaDauTuB();
        
        f.attach(a);
        f.attach(b);
        
        System.out.println("Lan 1");
        f.dataChanged();
        
        f.detach(a);
        System.out.println("Lan 2");
        f.dataChanged();
    }
}
