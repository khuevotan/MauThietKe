/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.Bai4_thay;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Tan Khue");
        u1.vote(Candidate.JoeBiden);
        User u2 = new User("Anh");
        u2.vote(Candidate.DonaldTrump);
        u2.vote(Candidate.JoeBiden);
        System.out.println("Joe " + Election.getInstance().getJoe());
        System.out.println("Trump " + Election.getInstance().getDonal());
    }
}
