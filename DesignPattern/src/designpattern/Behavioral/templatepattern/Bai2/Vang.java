/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.templatepattern.Bai2;

public class Vang extends HoaDon {

    @Override
    public double tinhChietKhau(double thanhTien) {
       if (thanhTien >= 500000) 
            return thanhTien * 0.03;
         else if (thanhTien >= 1000000) 
            return thanhTien * 0.05;
        return 0;
    }

    
}
