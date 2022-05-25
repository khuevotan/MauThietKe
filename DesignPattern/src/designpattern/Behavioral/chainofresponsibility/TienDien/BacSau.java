package designpattern.Behavioral.chainofresponsibility.TienDien;

public class BacSau implements ITinhTien {

    float giaBan;
    int min;
    ITinhTien caoHon;

    public BacSau(float giaBan, int min) {
        this.giaBan = giaBan;
        this.min = min;
    }

    @Override
    public ITinhTien thietLapCaoHon(ITinhTien xepLoai) {
       return null;
    }

    @Override
    public float xepLoai(float dien) {
        return (dien - min)*giaBan;
    }
}
