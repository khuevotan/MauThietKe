package designpattern.Behavioral.iteratorpattern.BaiTap1;

public class Main {
    public static void main(String[] args) {
        MyArray soNguyen = new MyArray(new int[]{1, 2, 3,4});
        MyIterator myIterator = soNguyen.CreateIterator();

        System.out.println(myIterator.First());
        while(myIterator.Next() != null) {
            System.out.println(", " + myIterator.CurrentItem());
        }
        System.out.println("\nSố phần tử của mảng: " + soNguyen.count());
        System.out.println("Gíá trị của mảng tại vị trí i:" + soNguyen.getItem(1));
    }
}
