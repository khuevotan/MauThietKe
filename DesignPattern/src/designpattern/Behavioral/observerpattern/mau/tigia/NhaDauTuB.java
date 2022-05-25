/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.observerpattern.mau.tigia;

public class NhaDauTuB implements TiGia.I_TheoDoiTiGia {
    TiGia t;
   
    public NhaDauTuB (TiGia t){
        this.t=t;
        t.attach(this);
    }
    public void huyDangKy(TiGia t){
        t.detach(this);
    }
    
    @Override
    public void capNhatTiGia(float delta) {
        if(delta > 0)
            System.out.println("B: Bán ra");
        else
            System.out.println("B : Mua vào");
    }
}
