package designpattern.Behavioral.observerpattern.abc.Bai1;

public abstract class ThanhVien implements Topic.CapNhatTin {
    Topic topic;
    String thongBao;

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public void huyDangKi() {
        topic.huyDangKi(this);
    }

    public abstract void capNhatTin(String thongBao);
}
