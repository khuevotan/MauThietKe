/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.Bai4;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Tan Khue", false);
        System.out.println(" " + user1.inThongTin());
        user1.vote(UngVien.DonaldTrump);
        
        User user2 = new User("Nguyen Anh", false);
        System.out.println(" " + user2.inThongTin());
        user2.vote(UngVien.JoeBiden);
    }
}
