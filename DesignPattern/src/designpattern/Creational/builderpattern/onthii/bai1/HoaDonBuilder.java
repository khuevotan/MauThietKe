/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package designpattern.Creational.builderpattern.onthii.bai1;

/**
 *
 * @author THIS PC
 */
public interface HoaDonBuilder {
    HoaDonBuilder addThongTinHD(String maHD, String ngayBan, String tenKH);
    HoaDonBuilder addChiTietHD(String tenSP, int soLuong, double donGia, double chietKhau);
    HoaDon build();
}
