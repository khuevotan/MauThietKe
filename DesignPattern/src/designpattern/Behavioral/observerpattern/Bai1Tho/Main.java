package designpattern.Behavioral.observerpattern.Bai1Tho;

public class Main {
    public static void main(String[] args) {
        Topic topic = new Topic();
        ThanhVienB b = new ThanhVienB(topic);
        ThanhVienA a = new ThanhVienA(topic);
        topic.taoTin("di cf");
        topic.taoTin("Di ia");
        a.huyDangKy(topic);
        String t1 = "Di nhau";
        topic.taoTin(t1);
        topic.capNhatTin(t1,"Di pay");
        topic.taoTin("Di ve");
        b.huyDangKy(topic);
    }
}
