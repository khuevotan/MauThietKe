/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Structural.decoratorpattern.Bai1;

public class Chia extends BieuThucDecorator{
    
    public Chia(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc, toanHang);
    }

    @Override
    public float giaTri() {
        if (getToanHang() != 0)
            return bieuThuc.giaTri() / getToanHang();
        else
            return 0;
    }

    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc() + "/" + Float.toString(getToanHang());
    }
}
