/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.templatepattern.Bai2;

public class ThanThiet extends HoaDon{

    @Override
    public double tinhChietKhau(double thanhTien) {
         if(thanhTien >= 500000)
           return thanhTien*0.02;
         return 0;
    }
   
}
