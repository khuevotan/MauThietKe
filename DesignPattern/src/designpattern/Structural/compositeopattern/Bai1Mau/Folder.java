package designpattern.Structural.compositeopattern.Bai1Mau;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {
    List<AbstractFile> dsThuMuc = new ArrayList<>();

    public Folder(String ten, String ngay) {
        super(ten, ngay);
    }

    @Override
    String getStringTreeFolder() {
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

    @Override
    void addItem(AbstractFile f) {
        if (!dsThuMuc.contains(f)) {
            dsThuMuc.add(f);
            f.duongDan = this.duongDan + "\\" + f.ten;
        }
    }

    @Override
    void removeItem(AbstractFile f) {
        if (dsThuMuc.contains(f)) {
            dsThuMuc.remove(f);
            return;
        }
        for (AbstractFile abstractFile : dsThuMuc) {
            abstractFile.removeItem(f);
        }
    }
}
