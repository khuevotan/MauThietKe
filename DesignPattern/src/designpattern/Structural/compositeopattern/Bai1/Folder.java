package designpattern.Structural.compositeopattern.Bai1;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {
    List<AbstractFile> dsThuMuc = new ArrayList<>();

    public Folder(String ten, String ngay) {
        super(ten, ngay);
    }

    @Override
    public void add(AbstractFile f) {
        // ton tai hay khong
        if (dsThuMuc.contains(f) == false) {
            dsThuMuc.add(f);
            f.duongDan = this.duongDan + "\\" + f.ten;
        }
    }

    @Override
    public void remove(AbstractFile f) {
        if (dsThuMuc.contains(f) == true) {
            dsThuMuc.remove(f);
            return;
        }
    }
    
    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(pre)
                .append(ten);
        for (AbstractFile abstractFile : dsThuMuc) {
            abstractFile.pre = this.pre + "..";
            builder.append("\n")
                    .append(abstractFile.getStringTreeFolder());
            abstractFile.pre = "";
        }
        return builder.toString();
    }
}
