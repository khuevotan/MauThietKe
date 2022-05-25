package designpattern.Creational.builderpattern.onthii.bai1;

/**
 *
 * @author THIS PC
 */
public class Main {
     public static void main(String[] args) {
        HoaDonBuilder hoadonbuilder = new HoaDonConcreteBuilder()
                .addThongTinHD("HD1", "4/4/2022", "Võ Tấn Khuê")
                .addChiTietHD("Xe Máy", 1, 100000, 10);
        
        System.out.println(hoadonbuilder.build());
        System.out.println(hoadonbuilder.toString());
    }
}
