package designpattern.Behavioral.templatepattern.QLData;

public class Main {
    public static void main(String[] args) {
        QLData<SinhVien> qlsv = new QLSinhVien();
        SinhVien sinhVien1 = new SinhVien(123, "1234", "nguyen van a", "1/1/2001", "Nha Trang");
        qlsv.them(sinhVien1);
        qlsv.hienThi();
        SinhVien sinhVien2 = new SinhVien(124, "1235", "nguyen van b", "1/2/2001", "Nha Trang");
        qlsv.them(sinhVien2);
        qlsv.hienThi();
    }
}
