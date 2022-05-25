/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.stratery.baitap2;

public class ThanhToanCOD implements IThanhToan {
    @Override
    public double thanhToan(int tienHang) {
        if(tienHang > 2000000){
            return tienHang * 0.98;
        }
        else return tienHang;
    }
}
