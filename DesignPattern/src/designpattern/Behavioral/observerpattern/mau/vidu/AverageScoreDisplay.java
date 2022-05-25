/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.observerpattern.mau.vidu;

/**
 *
 * @author THIS PC
 */
public class AverageScoreDisplay implements Observer {

    private float runRate;
    private int predictedScore;

    public void update(int runs, int wickets, float overs) {
        this.runRate = (float) runs / overs;
        this.predictedScore = (int) (this.runRate * 50);
        display();
    }

    public void display() {
        System.out.println("\nAverage Score Display: \n"
                + "Run Rate: " + runRate
                + "\nPredictedScore: "
                + predictedScore);
    }
}
