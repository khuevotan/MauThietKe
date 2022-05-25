package designpattern.Behavioral.observerpattern.abc.Bai1;

public class ThanhVienA extends ThanhVien {
    @Override
    public void capNhatTin(String thongBao) {
        System.out.println("Tin mới nhận: " + this.thongBao);
    }
}
