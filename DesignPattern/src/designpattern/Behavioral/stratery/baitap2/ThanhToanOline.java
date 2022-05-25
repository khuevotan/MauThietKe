/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.stratery.baitap2;

public class ThanhToanOline implements IThanhToan {
    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000000)
        {
            return tienHang * 0.95;
        }
        else {
            return tienHang * 0.93;
        }
    }
}