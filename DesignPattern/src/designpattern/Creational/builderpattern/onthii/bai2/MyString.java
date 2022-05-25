/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.builderpattern.onthii.bai2;

/**
 *
 * @author THIS PC
 */
public class MyString {
    private String str;

    public MyString(String str) {
        this.str = str;
    }
    
     public MyString addString(String s) {
        this.str = str + s;
        return this;
    }

    public MyString addFloat(float f) {
        this.str = str + f;
        return this;
    }

    public MyString addBoolean(boolean b) {
        this.str = str + b;
        return this;
    }

    @Override
    public String toString() {
        return "MyString{" + "str=" + str + '}';
    }
}
