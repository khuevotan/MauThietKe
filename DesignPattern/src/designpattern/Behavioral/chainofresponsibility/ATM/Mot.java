package designpattern.Behavioral.chainofresponsibility.ATM;

public class Mot implements IMenhGia{
    String nhan;
    float min;
    int soLuong = 0;

    public Mot(String nhan, float min) {
        this.nhan = nhan;
        this.min = min;
    }

    @Override
    public IMenhGia thietLapCaoHon(IMenhGia loaiTien) {
        return null;
    }

    @Override
    public String loaiTien(float tien) {
        if (tien >= min)
         {
            while(tien >=min){
                tien = tien - min;
                ++soLuong;
            }
                return nhan + soLuong; 
         }
        return "Không thê đổi được nữa";
    }
}
