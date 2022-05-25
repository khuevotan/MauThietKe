/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package designpattern.Creational.builderpattern.onthii.bai2;

/**
 *
 * @author THIS PC
 */
public interface MyStringBuilder {
    MyStringBuilder setStr(String str);
    MyStringBuilder addString(String s);
    MyStringBuilder addFloat(float f);
    MyStringBuilder addBoolean(boolean b);
    MyString build();
}
