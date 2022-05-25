package designpattern.Behavioral.templatepattern.QLData;

public class SinhVien {
    int id;
    String mssv, ten, ngaySinh, queQuan;

    public SinhVien(int id, String mssv, String ten, String ngaySinh, String queQuan) {
        this.id = id;
        this.mssv = mssv;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public int getId() {
        return id;
    }

    public String getMssv() {
        return mssv;
    }

    public String getTen() {
        return ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }
}
