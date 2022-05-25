package designpattern.Behavioral.observerpattern.abc.Bai2;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan minh = new TaiKhoan("Minh", 1000, atm);
        TaiKhoan anh = new TaiKhoan("Anh", 1500, atm);
        System.out.println("Giao dịch lần 1: ");
        minh.duaTheVaoATM();
        atm.rutTien(300);
        minh.rutThe();
        System.out.println("\nGiao dịch lần 2: ");
        anh.duaTheVaoATM();
        atm.rutTien(500);
        System.out.println("\nGiao dịch lần 3: ");
        atm.rutTien(100);
        anh.rutThe();
        System.out.println("\nGiao dịch lần 4: ");
        atm.rutTien(200);
    }
}
