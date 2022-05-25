/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.stratery.baitap3;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.set(2020, 12, 20);
        calendar2.set(2020, 12, 22);

        calendar.set(2020, 12, 20);
        calendar2.set(2020, 12, 22);
        
        QLSV qlsv = new QLSV();
        qlsv.getSinhViens().add(new SinhVien("Ngoc Y", calendar.getTime(), 8.0F));
        qlsv.getSinhViens().add(new SinhVien("An Tam", calendar2.getTime(), 6.0F));
        qlsv.getSinhViens().add(new SinhVien("Binh An", calendar2.getTime(), 9.0F));
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();
    }
}
