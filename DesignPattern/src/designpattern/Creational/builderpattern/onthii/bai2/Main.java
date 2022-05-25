
package designpattern.Creational.builderpattern.onthii.bai2;

public class Main {

    public static void main(String[] args) {
        MyStringBuilder mystringBuilder = new MyStringConcreteBuilder()
                .setStr("Khuê")
                .addString("điểm môn học ")
                .addFloat(6.5f)
                .addString(" ")
                .addBoolean(true);
        System.out.println(mystringBuilder.build());
        System.out.println(mystringBuilder.toString());
    }
}
