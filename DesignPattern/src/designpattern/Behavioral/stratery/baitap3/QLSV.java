/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.stratery.baitap3;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    List<SinhVien> sinhViens = new ArrayList<>();
    ISoSanh<SinhVien> soSanh;

    public void sapXep() {
        //TODO sap xep dung thu vien
        sinhViens.sort((o1, o2) -> {
            return soSanh.soSanh(o1, o2);
        });
    }

    public void inDS() {
        sinhViens.forEach((t) -> {
            System.out.println(t.toString());
        });
    }

    public List<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(List<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }

    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
}
