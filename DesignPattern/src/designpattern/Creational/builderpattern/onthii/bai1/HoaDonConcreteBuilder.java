/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.builderpattern.onthii.bai1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THIS PC
 */
public class HoaDonConcreteBuilder implements HoaDonBuilder {

    HoaDonHeader thongTinHD;
    List<CTHD> chiTietHDS = new ArrayList<>();

    @Override
    public HoaDonBuilder addThongTinHD(String maHD, String ngayBan, String tenKH) {
        thongTinHD = new HoaDonHeader(maHD, ngayBan, tenKH);
        return this;
    }

    @Override
    public HoaDonBuilder addChiTietHD(String tenSP, int soLuong, double donGia, double chietKhau) {
        chiTietHDS.add(new CTHD(tenSP, soLuong, donGia, chietKhau));
        return this;
    }

    @Override
    public HoaDon build() {
        return new HoaDon(thongTinHD, chiTietHDS);
    }

}
