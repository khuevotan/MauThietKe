/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.observerpattern.mau.tygia2;

import java.util.ArrayList;
import java.util.List;

public class TyGia implements Subject{
    float delta;
    List <Observer> observerList = new ArrayList();
    
    @Override
    public void attach(Observer o) {
        observerList.add(o);
    }

    @Override
    public void detach(Observer o) {
        observerList.remove(observerList.indexOf(o));
    }

     @Override
    public void notifyTyGia() {
       for (Observer o: observerList)
            o.capNhatTyGia(delta); 
    }
    
    public float getDelta() {
        return 4;
    }
    
    public void dataChanged() { 
        delta = getDelta();
        notifyTyGia();
    }
}





//    @Override
//    public void notifyTyGia() {
//        for (Iterator<Observer> it
//                = observerList.iterator(); it.hasNext();) {
//            Observer o = it.next();
//            o.capNhatTyGia(delta);
//        }
//    }
