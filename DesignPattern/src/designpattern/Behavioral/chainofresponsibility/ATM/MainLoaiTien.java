/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.chainofresponsibility.ATM;

/**
 *
 * @author THIS PC
 */
public class MainLoaiTien {
    public static void main(String[] args) {
        IMenhGia motTram = new LoaiTien("Một trăm", 100.0F);
        IMenhGia namMuoi = new LoaiTien("Năm mươi", 50.0F);
        IMenhGia haiMuoi = new LoaiTien("Hai mươi", 20.0F);
        IMenhGia muoi = new LoaiTien("Mười", 10.0F);
        IMenhGia nam = new LoaiTien("Năm ngàn", 5.0F);
        IMenhGia hai = new LoaiTien("Hai ngàn", 2.0F);
        IMenhGia mot = new LoaiTien("Một ngàn", 1.0F);

        motTram.thietLapCaoHon(namMuoi)
                .thietLapCaoHon(haiMuoi)
                .thietLapCaoHon(muoi)
                .thietLapCaoHon(nam)
                .thietLapCaoHon(hai)
                .thietLapCaoHon(mot);

        System.out.println("Số tiền 2675");
        System.out.println(motTram.loaiTien(2673F));
    }
}
