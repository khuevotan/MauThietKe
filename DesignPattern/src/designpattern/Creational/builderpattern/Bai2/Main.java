/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Creational.builderpattern.Bai2;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.Str("Võ Tấn Khuê ")
                .addString("điểm môn học ")
                .addFloat(6.5f)
                .addString(" ")
                .addBoolean(true)
                .build();
        System.out.println(myStringBuilder);
    }
}
