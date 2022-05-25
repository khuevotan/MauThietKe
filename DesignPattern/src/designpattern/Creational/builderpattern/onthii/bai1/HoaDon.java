/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.builderpattern.onthii.bai1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader thongTinHD;
    List<CTHD> chiTietHDS = new ArrayList<>();

    public HoaDon(HoaDonHeader thongTinHD, List<CTHD> chiTietHDS) {
        this.thongTinHD = thongTinHD;
        this.chiTietHDS = chiTietHDS;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "thongTinHD=" + thongTinHD + ", chiTietHDS=" + chiTietHDS + '}';
    }
}
