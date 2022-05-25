package designpattern.Behavioral.observerpattern.abc.Bai1;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<CapNhatTin> thongTin = new ArrayList<>();

    String thongBao;

    public Topic(String thongBao) {
        this.thongBao = thongBao;
    }

    public void dangKi(CapNhatTin capNhatTin) {
        if(!thongTin.contains(capNhatTin))
            thongTin.add(capNhatTin);
    }

    public void huyDangKi(CapNhatTin capNhatTin) {
        if(thongTin.contains(capNhatTin))
            thongTin.remove(capNhatTin);
    }

    public void thongBaoCapNhat(String thongBaoMoi) {
        this.thongBao = thongBaoMoi;
        for (CapNhatTin capNhatTin : thongTin) {
            capNhatTin.capNhatTin(thongBao);
        }
    }

    public interface CapNhatTin {
        void capNhatTin(String thongTin);
    }
}
