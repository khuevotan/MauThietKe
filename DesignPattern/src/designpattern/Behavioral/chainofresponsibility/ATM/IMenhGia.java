/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package designpattern.Behavioral.chainofresponsibility.ATM;

public interface IMenhGia {
    IMenhGia thietLapCaoHon(IMenhGia xepLoai);
    String loaiTien(float tien);
}
