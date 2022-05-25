/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.observerpattern.mau.vidu;

/**
 *
 * @author THIS PC
 */
public class CurrentScoreDisplay implements Observer {

    private int runs, wickets;
    private float overs;

    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    public void display() {
        System.out.println("\nCurrent Score Display:\n"
                + "Runs: " + runs
                + "\nWickets:" + wickets
                + "\nOvers: " + overs);
    }
}
