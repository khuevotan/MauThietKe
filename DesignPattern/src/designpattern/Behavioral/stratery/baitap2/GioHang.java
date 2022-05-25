/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.stratery.baitap2;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    IThanhToan hinhThucTT;

    public IThanhToan getHinhThucTT() {
        return hinhThucTT;
    }

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    List<HangHoa> hh = new ArrayList<HangHoa>();
    public double thanhToan(){
        double Tong = 0;
        for (HangHoa item: hh){
            Tong = hinhThucTT.thanhToan(item.getGia()) + Tong;
        }
        return Tong;
    }
}