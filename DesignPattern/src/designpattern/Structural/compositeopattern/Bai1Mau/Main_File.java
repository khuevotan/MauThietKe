package designpattern.Structural.compositeopattern.Bai1Mau;

public class Main_File {
    public static void main(String[] args) {
        AbstractFile data = new Folder("Data (D:)", "02/05");
        AbstractFile taiLieu = new Folder("TaiLieu", "02/05");
        AbstractFile designPattern = new Folder("Design Pattern", "02/05");
        AbstractFile pptx1 = new Folder("CreationalPattern.pptx", "02/05");
        AbstractFile pptx2 = new Folder("StructuralPattern.pptx", "02/05");
        AbstractFile ltJava = new Folder("Lap Trinh Java", "02/05");
        AbstractFile word = new Folder("LapTrinhJavaCoBan.docx", "02/05");
        AbstractFile pdf = new Folder("LapTrinhJavaNangCao.pdf", "02/05");
        AbstractFile c = new Folder("NgonNguLapTrinhC.pdf", "02/05");
        AbstractFile diDong = new Folder("LapTrinhThietBiDiDong", "02/05");
        AbstractFile pptx3 = new Folder("CoBan.pptx", "02/05");
        AbstractFile pptx4 = new Folder("NangCao.pptx", "02/05");

        data.addItem(taiLieu);
        taiLieu.addItem(designPattern);
        taiLieu.addItem(ltJava);
        taiLieu.addItem(c);
        taiLieu.addItem(diDong);
        designPattern.addItem(pptx1);
        designPattern.addItem(pptx2);
        ltJava.addItem(word);
        ltJava.addItem(pdf);
        diDong.addItem(pptx3);
        diDong.addItem(pptx4);

        System.out.println("Cây thư mục data (D:) ");
        System.out.println(data.getStringTreeFolder());

        designPattern.removeItem(pptx2);
        System.out.println("\nCây thư mục Design Pattern: ");
        System.out.println(designPattern.getStringTreeFolder());


        System.out.println("\nĐường dẫn lập trình Java: ");
        System.out.println(ltJava.getPath());
    }

}
