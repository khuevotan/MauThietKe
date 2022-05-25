package designpattern.Behavioral.observerpattern.CachHai.Bai1;

public class ThanhVienA implements Observer {

    Topic topic;

    public ThanhVienA(Topic topic) {
        this.topic = topic;
    }

    @Override
    public void thongBao(String tin, boolean them) {
        if (them) {
            System.out.println("Thông Báo Của A");
        
                System.out.println(tin);
        
        } else {
            System.out.println(("Cập nhật A: " + tin));
        }
    }

}
}
