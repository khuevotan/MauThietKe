/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Structural.decoratorpattern.Bai1;


/**
 *
 * @author THIS PC
 */
public class TuyetDoi extends BieuThucDecorator{

    public TuyetDoi(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc, toanHang);
    }
    
    @Override
    public float giaTri() {
       return bieuThuc.giaTri() + Math.abs(getToanHang());
    }
    
    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc() + "+" + "|" +(getToanHang()) + "|";
    }
    
}
