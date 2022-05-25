/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Structural.decoratorpattern.Bai1;

public class Nhan extends BieuThucDecorator{
    
    public Nhan(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc, toanHang);
    }

    @Override
    public float giaTri() {
       return bieuThuc.giaTri() * getToanHang();
    }
    
    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc() + "*" + Float.toString(getToanHang());
    }
}
