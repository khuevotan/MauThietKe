package designpattern.Behavioral.chainofresponsibility.TienDien;

public class tinhTien implements ITinhTien{
   
    float giaBan;
    int min;
    int max;
    ITinhTien caoHon;

    public tinhTien(float giaBan, int min, int max) {
        this.giaBan = giaBan;
        this.min = min;
        this.max = max;
    }

    @Override
    public ITinhTien thietLapCaoHon(ITinhTien xepLoai) {
         caoHon = xepLoai;
         return xepLoai;
    }

    @Override
    public float xepLoai(float dien) {
        if (dien <= max)
            return (dien - min)*giaBan;
        else
            return (max - min)*giaBan + caoHon.xepLoai(dien);
    }
}
