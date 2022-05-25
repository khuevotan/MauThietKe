package designpattern.Behavioral.templatepattern.QLData;

public class QLSinhVien extends QLData<SinhVien> {
    @Override
    protected int khoa(SinhVien sinhVien) {
        return sinhVien.id;
    }

    @Override
    public void hienThiDoiTuong(SinhVien sinhVien) {
        System.out.println("id: " + sinhVien.id);
        System.out.println("MSSV: " + sinhVien.mssv);
        System.out.println("ten: " + sinhVien.ten);
        System.out.println("ngay sinh: " + sinhVien.ngaySinh);
        System.out.println("quen quan: " + sinhVien.queQuan);
    }
}
