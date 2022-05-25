
package designpattern.Behavioral.templatepattern.Bai2;

import java.util.ArrayList;
import java.util.List;


public abstract class HoaDon {

    List<MatHang> matHang = new ArrayList<>();

    public void setList(List<MatHang> list) {
        this.matHang = list;
    }

    public double tinhTien() {
        double thanhTien = 0;
        for (MatHang o : matHang) {
            thanhTien = thanhTien + o.donGia * o.soLuong;
        }
        return thanhTien;
    }

    public abstract double tinhChietKhau(double thanhTien);

    public void hienThiGioHang() {
        System.out.println("Thông tin các mặt hàng trong giỏ hàng");
        for (MatHang hang : matHang) {
            hang.hienThiMatHang();
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
