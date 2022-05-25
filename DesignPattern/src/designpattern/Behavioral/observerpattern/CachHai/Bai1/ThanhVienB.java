package designpattern.Behavioral.observerpattern.CachHai.Bai1;

import java.util.List;

public class ThanhVienB implements Observer{

    @Override
    public void thongBao(List<String> thongTinList) {
       int i=0;
       System.out.println("Thông Báo Của B");
       for (String s : thongTinList) {
           System.out.println("Tin thứ " + ++i + " : ");
           System.out.println(s);
        }
    }
}
