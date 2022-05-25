package designpattern.Structural.compositeopattern.Bai1Mau;

public class File extends AbstractFile {
    public File(String ten, String ngay) {
        super(ten, ngay);
    }

    @Override
    String getStringTreeFolder() {
        return pre + ten;
    }

    @Override
    void addItem(AbstractFile f) {
    }

    @Override
    void removeItem(AbstractFile f) {
    }
}
