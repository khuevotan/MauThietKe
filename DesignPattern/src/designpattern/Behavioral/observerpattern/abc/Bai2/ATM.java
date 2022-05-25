package designpattern.Behavioral.observerpattern.abc.Bai2;

// ATM là subject

public class ATM {
    private ITaiKhoanITM taiKhoan;

    public void attack(ITaiKhoanITM taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public void detach() {
        this.taiKhoan = null;
    }

    private boolean kiemTraTienRut(int soTienRut) {
        return taiKhoan.kiemTraSoDu(soTienRut);
    }

    public void rutTien(int soTienRut) {
        if (taiKhoan != null) {
            if (kiemTraTienRut(soTienRut))
                taiKhoan.thongBao(soTienRut, true);
            else
                taiKhoan.thongBao(soTienRut, false);
        } else
            System.out.println("Không có thẻ tring máy!!!");
    }

    public static interface ITaiKhoanITM {
        boolean kiemTraSoDu(int soTienRut);
        // các thông báo cảu subject thường nằm trên các tham số
        // của các phương thức
        void thongBao(int soTienRut, boolean thanhCong);
    } 
}
