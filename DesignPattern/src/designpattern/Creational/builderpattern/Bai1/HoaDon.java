/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.builderpattern.Bai1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader thongTinHD;
    List<CTHD> chiTietHDS = new ArrayList<>();
    
    public HoaDon(Builder builder) {
        this.thongTinHD = builder.thongTinHD;
        this.chiTietHDS = builder.chiTietHDS;
    }

    public static class Builder {
        HoaDonHeader thongTinHD;
        List<CTHD> chiTietHDS = new ArrayList<>();

        public Builder addThongTinHD(String maHD, String ngayBan, String tenKH) {
            thongTinHD = new HoaDonHeader(maHD, ngayBan, tenKH);
            return this;
        }

        public Builder addChiTietHD(String tenSP, int soLuong, double donGia, double chietKhau) {
            chiTietHDS.add(new CTHD(tenSP, soLuong, donGia, chietKhau));
            return this;
        }

        public HoaDon build() {
            return new HoaDon(this);
        }
    }

    public void In() {
        System.out.println(thongTinHD.toString());
        chiTietHDS.forEach((cthd) -> {
            System.out.println(cthd.toString());
        });
    }
}
