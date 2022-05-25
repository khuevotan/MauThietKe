/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.chainofresponsibility.ATM;

/**
 *
 * @author THIS PC
 */
public class LoaiTien implements IMenhGia {

    String nhan;
    float min;
    int soLuong = 0;
    IMenhGia caoHon;

    public LoaiTien(String nhan, float min) {
        this.nhan = nhan;
        this.min = min;
    }

    @Override
    public IMenhGia thietLapCaoHon(IMenhGia xepLoai) {
        caoHon = xepLoai;
        return xepLoai;
    }

    @Override
    public String loaiTien(float tien) {
        if (this.caoHon != null) {
            if (tien >= min) {
                while (tien >= min) {
                    tien = tien - min;
                    ++soLuong;
                }
                System.out.println(nhan + ": " + soLuong);
            }
            return caoHon.loaiTien(tien);
        }
        return "";
    }
}