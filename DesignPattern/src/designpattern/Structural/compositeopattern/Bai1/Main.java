package designpattern.Structural.compositeopattern.Bai1;

public class Main {
    public static void main(String[] args) {
       AbstractFile data = new Folder("Data (D:)", "02/05");
        AbstractFile taiLieu = new Folder("TaiLieu", "02/05");
        AbstractFile designPattern = new Folder("Design Pattern", "02/05");
        AbstractFile pptx1 = new File("CreationalPattern.pptx", "02/05");
        AbstractFile pptx2 = new File("StructuralPattern.pptx", "02/05");
        AbstractFile ltJava = new Folder("Lap Trinh Java", "02/05");
        AbstractFile word = new File("LapTrinhJavaCoBan.docx", "02/05");
        AbstractFile pdf = new File("LapTrinhJavaNangCao.pdf", "02/05");
        AbstractFile c = new File("NgonNguLapTrinhC.pdf", "02/05");
        AbstractFile diDong = new Folder("LapTrinhThietBiDiDong", "02/05");
        AbstractFile pptx3 = new File("CoBan.pptx", "02/05");
        AbstractFile pptx4 = new File("NangCao.pptx", "02/05");

        data.add(taiLieu);
        taiLieu.add(designPattern);
        taiLieu.add(ltJava);
        taiLieu.add(c);
        taiLieu.add(diDong);
        designPattern.add(pptx1);
        designPattern.add(pptx2);
        ltJava.add(word);
        ltJava.add(pdf);
        diDong.add(pptx3);
        diDong.add(pptx4);

        System.out.println(data.getStringTreeFolder());

        designPattern.remove(pptx2);
        System.out.println("\nCây thư mục Design Pattern: ");
        System.out.println(designPattern.getStringTreeFolder());

        System.out.println("\nĐường dẫn lập trình Java: ");
        System.out.println(ltJava.getDuongDan());
    }

}
