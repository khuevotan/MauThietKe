/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.templatepattern.Bai1;

public class ThanhToanOnline extends GioHang {

    @Override
    public double tinhChietKhau(double thanhTien) {
        if (thanhTien >= 1000000) {
            return thanhTien * 0.05;
        } else {
            return thanhTien * 0.03;
        }
    }
}
