package designpattern.Behavioral.templatepattern.Bai1;

import java.util.ArrayList;
import java.util.List;

public abstract class GioHang {

    List<CTGH> gioHang = new ArrayList<>();

    public void setList(List<CTGH> list) {
        this.gioHang = list;
    }

    public double tinhTien() {
        double thanhTien = 0;
        for (CTGH matHang : gioHang) {
            thanhTien = thanhTien + (matHang.donGia * matHang.soLuong);
        }
        return thanhTien;
    }

    public abstract double tinhChietKhau(double thanhTien);

    public void hienThiGioHang() {

        System.out.println("Thông tin các mặt hàng trong giỏ hàng");
        for (CTGH matHang : gioHang) {
            matHang.hienThiMatHang();
        }

        double tongTien = tinhTien();
        double tongChietKhau = tinhChietKhau(tongTien);
        double tienTra = tongTien - tongChietKhau;
        System.out.println("Tổng tiền mua hàng: " + tongTien);
        System.out.println("Tiền chiết khấu: " + tongChietKhau);
        System.out.println("Tiền cần thanh toán: " + tienTra);
        System.out.println();
    }
}
