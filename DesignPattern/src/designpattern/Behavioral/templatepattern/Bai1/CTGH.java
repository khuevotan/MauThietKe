package designpattern.Behavioral.templatepattern.Bai1;

public class CTGH {
    String tenMatHang;
    int soLuong;
    double donGia;
   

    public CTGH(String tenMatHang, int soLuong, double donGia) {
        this.tenMatHang = tenMatHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public void hienThiMatHang() {
        System.out.println("Mặt hàng = " + tenMatHang + ", Số lượng = " + soLuong + ", Giá = " + donGia);
    }
}
