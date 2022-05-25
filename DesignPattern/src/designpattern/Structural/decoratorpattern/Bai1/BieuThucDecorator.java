/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Structural.decoratorpattern.Bai1;

public abstract class BieuThucDecorator extends BieuThuc{
    BieuThuc bieuThuc;
    private float toanHang;

    public float getToanHang() {
        return toanHang;
    }
    
    public BieuThucDecorator(BieuThuc bieuThuc, float toanHang) {
        this.bieuThuc = bieuThuc;
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri();
    }

    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc();
    }
}
