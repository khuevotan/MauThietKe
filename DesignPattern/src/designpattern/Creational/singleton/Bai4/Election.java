/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.Bai4;

public class Election {

    private static Election instance;
    private int voteTrump = 0;
    private int voteBiden = 0;

    protected Election() {

    }

    public static Election createInstance() {

        // Uses "Lazy initialization"
        if (instance == null) {
            instance = new Election();
        }
        return instance;
    }

    public void vote(UngVien c) {
        if (c == UngVien.DonaldTrump)
            voteTrump += 1;
        else voteBiden += 1;
        System.out.println("Donald Trump: " + voteTrump + " vote\n" + "Joe Biden: " + voteBiden + " vote");
    }
}
