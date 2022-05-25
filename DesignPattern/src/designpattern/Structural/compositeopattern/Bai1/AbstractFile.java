package designpattern.Structural.compositeopattern.Bai1;

public abstract class AbstractFile {
    String duongDan, ten, ngayTao;
    String pre = "";

    public AbstractFile(String ten, String ngayTao) {
        duongDan = ten;
        this.ten = ten;
        this.ngayTao = ngayTao;
    }

    abstract void add(AbstractFile f);
    abstract void remove(AbstractFile f);
    abstract String getStringTreeFolder();

    public String getDuongDan() {
        return duongDan;
    }
}