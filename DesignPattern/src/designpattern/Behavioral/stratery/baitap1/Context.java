/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.stratery.baitap1;

/**
 *
 * @author THIS PC
 */
public class Context {
    private ITinh tinhToan;

    public ITinh getTinhToan() {
        return tinhToan;
    }

    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }
    
    public float tinhToan(float a, float b) {
        return tinhToan.tinh(a, b);
    }
    
}
