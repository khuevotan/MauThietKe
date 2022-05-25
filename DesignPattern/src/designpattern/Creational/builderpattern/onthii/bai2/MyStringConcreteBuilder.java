/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.builderpattern.onthii.bai2;

/**
 *
 * @author THIS PC
 */
public class MyStringConcreteBuilder implements MyStringBuilder {

    String str;

    @Override
    public MyString build() {
        return new MyString(str);
    }
    
    @Override
    public MyStringBuilder setStr(String str) {
        this.str = str;
        return this;
    }


    @Override
    public MyStringBuilder addString(String s) {
        this.str = str + s;
        return this;
    }

    @Override
    public MyStringBuilder addFloat(float f) {
        this.str = str + f;
        return this;
    }

    @Override
    public MyStringBuilder addBoolean(boolean b) {
        this.str = str + b;
        return this;
    }

}
