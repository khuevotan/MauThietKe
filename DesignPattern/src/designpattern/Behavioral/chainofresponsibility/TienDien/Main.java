package designpattern.Behavioral.chainofresponsibility.TienDien;

public class Main {
     public static void main(String[] args) {
        ITinhTien trasau_B1 = new tinhTien(1.678F, 0, 50);
        ITinhTien trasau_B2 = new tinhTien(1.734F, 50, 100);
        ITinhTien trasau_B3 = new tinhTien(2.014F, 100, 200);
        ITinhTien trasau_B4 = new tinhTien(2.536F, 200, 300);
        ITinhTien trasau_B5 = new tinhTien(2.834F, 300, 400);
        ITinhTien trasau_B6 = new BacSau(2.927F, 400);

        trasau_B1.thietLapCaoHon(trasau_B2)
                .thietLapCaoHon(trasau_B3)
                .thietLapCaoHon(trasau_B4)
                .thietLapCaoHon(trasau_B5)
                .thietLapCaoHon(trasau_B6);

        System.out.println("Tiền điện của 10kWh là: 16 780 - " + trasau_B1.xepLoai(10F));  
        System.out.println("Tiền điện của 60kWh là: 101 240 - " + trasau_B1.xepLoai(60F)); 
        System.out.println("Tiền điện của 120kWh là: 210 880 - " + trasau_B1.xepLoai(120F)); 
        System.out.println("Tiền điện của 230kWh là: 448 080 - " + trasau_B1.xepLoai(230F)); 
        System.out.println("Tiền điện của 340kWh là: 738 960 - " + trasau_B1.xepLoai(340F)); 
        System.out.println("Tiền điện của 500kWh là: 1 201 700 - " + trasau_B1.xepLoai(500F)); 
    }
}
