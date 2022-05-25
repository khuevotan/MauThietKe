package designpattern.Behavioral.chainofresponsibility.TienDien;

public interface ITinhTien {
    ITinhTien thietLapCaoHon(ITinhTien xepLoai);
    float xepLoai(float dien);
}
