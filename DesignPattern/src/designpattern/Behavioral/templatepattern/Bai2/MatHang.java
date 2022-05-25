/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.templatepattern.Bai2;

/**
 *
 * @author THIS PC
 */
public class MatHang {
    String tenMatHang;
    int soLuong;
    double donGia;

    public MatHang(String tenMatHang, int soLuong, double donGia) {
        this.tenMatHang = tenMatHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    
    public void hienThiMatHang() {
        System.out.println("Mặt hàng = " + tenMatHang + ", Số lượng = " + soLuong + ", Giá = " + donGia);
    }
}
