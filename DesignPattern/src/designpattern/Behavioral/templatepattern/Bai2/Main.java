/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.templatepattern.Bai2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THIS PC
 */
public class Main {

    public static void main(String[] args) {

        List<MatHang> listMH1 = new ArrayList<>();
        listMH1.add(new MatHang("Thịt gà", 5, 3000));
        listMH1.add(new MatHang("Thịt heo", 5, 5000));
        listMH1.add(new MatHang("Hành Phi", 1, 1000));
        listMH1.add(new MatHang("Thịt bò", 1, 4000));

        System.out.println("Khách hàng thân thiết");
        HoaDon khTT = new ThanThiet();
        khTT.setList(listMH1);
        khTT.hienThiGioHang();

        System.out.println("Khách hàng vàng");
        HoaDon khV = new Vang();
        khV.setList(listMH1);
        khV.hienThiGioHang();

        System.out.println("Khách hàng kim cương");
        HoaDon khKC = new KimCuong();
        khKC.setList(listMH1);
        khKC.hienThiGioHang();
    }
}
