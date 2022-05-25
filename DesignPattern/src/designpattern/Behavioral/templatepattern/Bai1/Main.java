package designpattern.Behavioral.templatepattern.Bai1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CTGH> listMH1 = new ArrayList<>();
        listMH1.add(new CTGH("Thịt gà", 1, 3000));
        listMH1.add(new CTGH("Thịt bò", 1, 5000));
        listMH1.add(new CTGH("Thịt vịt", 1, 1000));
        listMH1.add(new CTGH("Thịt heo", 1, 4000));

        System.out.println("Thang toán COD");
        GioHang gioHang1 = new ThanhToanCOD();
        gioHang1.setList(listMH1);
        gioHang1.hienThiGioHang();

        List<CTGH> listMH2 = new ArrayList<>();
        listMH2.add(new CTGH("Bút bi", 2, 30));
        listMH2.add(new CTGH("Thước", 2, 50));
        listMH2.add(new CTGH("Điện thoại", 1, 10));
        listMH2.add(new CTGH("Dù", 2, 40));

       
        System.out.println("Thang toán Online");
        GioHang gioHang2 = new ThanhToanOnline();
        gioHang2.setList(listMH2);
        gioHang2.hienThiGioHang();
    }
}
