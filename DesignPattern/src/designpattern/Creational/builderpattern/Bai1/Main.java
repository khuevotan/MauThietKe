/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.builderpattern.Bai1;

/**
 *
 * @author THIS PC
 */
public class Main {
     public static void main(String[] args) {
        HoaDon.Builder builder = new HoaDon.Builder();
        HoaDon hd = builder.addThongTinHD("HD1", "4/4/2022", "Võ Tấn Khuê")
                .addChiTietHD("Xe Máy", 1, 100000, 10)
                .build();
        hd.In();
    }
}
