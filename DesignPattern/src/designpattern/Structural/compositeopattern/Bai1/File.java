package designpattern.Structural.compositeopattern.Bai1;

public class File extends AbstractFile {
    public File(String ten, String ngay) {
        super(ten, ngay);
    }

    @Override
    public void add(AbstractFile f) {
        
    }

    @Override
    public void remove(AbstractFile f) {
        
    }
    
    @Override
    public String getStringTreeFolder() {
        return pre + ten;
    }
}
