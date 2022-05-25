/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.builderpattern.Bai2;

public class MyStringBuilder {
    private String str;

    public MyStringBuilder Str(String s) {
        this.str = s;
        return this;
    }

    public MyStringBuilder addString(String s) {
        this.str = str + s;
        return this;
    }

    public MyStringBuilder addFloat(float f) {
        this.str = str + f;
        return this;
    }

    public MyStringBuilder addBoolean(boolean b) {
        this.str = str + b;
        return this;
    }

    public MyStringBuilder build() {
        return new MyStringBuilder();
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" +
                "str='" + str + '\'' +
                '}';
    }
}