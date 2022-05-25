/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.observerpattern.mau.tygia2;

/**
 *
 * @author THIS PC
 */
public class NhaDauTuB implements Observer{
    
    @Override
    public void capNhatTyGia(float delta) {
          if(delta > 0)
            System.out.println("B: Bán ra");
        else
            System.out.println("B : Mua vào");
    }
    
}
