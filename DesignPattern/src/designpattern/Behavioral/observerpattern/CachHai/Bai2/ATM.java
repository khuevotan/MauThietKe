/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.observerpattern.CachHai.Bai2;

public class ATM implements Subject{
    
    private Observer taiKhoan;

    @Override
    public void attach(Observer taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    @Override
    public void detach(Observer taiKhoan) {
         this.taiKhoan = null;    
    }

    @Override
    public boolean kiemTraTienRut(int soTienRut) {
       return taiKhoan.kiemTraSoDu(soTienRut);
    }
  
    public void rutTien(int soTienRut) {
        if (taiKhoan != null) {
            if (kiemTraTienRut(soTienRut))
                taiKhoan.thongBao(soTienRut, true);
            else
                taiKhoan.thongBao(soTienRut, false);
        } else
            System.out.println("Không có thẻ trong máy!");
    }
}
