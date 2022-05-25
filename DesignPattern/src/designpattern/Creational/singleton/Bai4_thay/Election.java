/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.singleton.Bai4_thay;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;
    private int joe = 0, donal = 0;
    List<String> users = new ArrayList();

    public int getJoe() {
        return joe;
    }

    public int getDonal() {
        return donal;
    }

    public Election() {
    }

    public static Election getInstance() {
        if (instance == null)
            instance = new Election();
        return instance;
    }

    public void vote(Candidate candidate, User user) {
        if (users.contains(user.name))
            return;
        {
            if (candidate == Candidate.DonaldTrump) {
                donal++;
                users.add(user.name);
            } else if (candidate == Candidate.JoeBiden) {
                joe++;
                users.add(user.name);
            }
        }
    }  
}