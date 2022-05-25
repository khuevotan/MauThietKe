/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package designpattern.Behavioral.observerpattern.CachHai.Bai1;

/**
 *
 * @author THIS PC
 */
public interface Subject {
    public void attach(Observer o); 
    public void detach(Observer o); 
    public void notifyTopic(); 
}
