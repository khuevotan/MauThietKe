/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.observerpattern.mau.tigia;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    List <I_TheoDoiTiGia> observer = new ArrayList();
    
    public void attach(I_TheoDoiTiGia o){
        if (!observer.contains(o)) {
            observer.add(o);
        }
    }
    
    public void detach(I_TheoDoiTiGia o){
        if (observer.contains(o)) {
            observer.remove(o);
        }
    }
            
    public void notifyTiGia(float delta){
        for (I_TheoDoiTiGia o: observer)
            o.capNhatTiGia(delta); 
    }
    
    static public interface I_TheoDoiTiGia {
        void capNhatTiGia(float delta);
    }
}
