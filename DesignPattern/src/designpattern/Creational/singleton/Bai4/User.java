/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.Bai4;

public class User {
    String name;
    boolean voted; 

    public User(String name, boolean voted) {
        this.name = name;
        this.voted = voted;
    }
    
      public void vote(UngVien c)
    {
        Election e = Election.createInstance();
        if(!voted)
        {
            e.vote(c);
            voted = true;
        }
    }
      
    public String inThongTin() {
        return "User " + name ;
    }
}
