package designpattern.Structural.compositeopattern.Bai1Mau;

public abstract class AbstractFile {
    String duongDan;
    String ten;
    String ngay;
    String pre = "";

    public AbstractFile(String ten, String ngay) {
        duongDan = ten;
        this.ten = ten;
        this.ngay = ngay;
    }

    abstract String getStringTreeFolder();

    public String getPath() {
        return duongDan;
    }

    abstract void addItem(AbstractFile f);

    abstract void removeItem(AbstractFile f);
}
