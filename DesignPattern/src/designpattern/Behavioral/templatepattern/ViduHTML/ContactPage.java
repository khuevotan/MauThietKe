/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.templatepattern.ViduHTML;

/**
 *
 * @author THIS PC
 */
public class ContactPage extends PageTemplate{

     @Override
    protected void showNavigation() {
        // Just do nothing
        // Because we don't want to show navigation bar on contact page
        
        // Không làm gì cả
         // Vì chúng tôi không muốn hiển thị thanh điều hướng trên trang liên hệ
    }
 
    @Override
    protected void showBody() {
        System.out.println("Content of contact page");
    }
    
}
