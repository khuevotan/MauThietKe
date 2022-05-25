package designpattern.Behavioral.templatepattern.Bai1;

public class ThanhToanCOD extends GioHang {
   
    @Override
    public double tinhChietKhau(double thanhTien) {
        if(thanhTien >= 1000000)
       {
           return thanhTien*0.05;
       }
       return 0;
    }
}
