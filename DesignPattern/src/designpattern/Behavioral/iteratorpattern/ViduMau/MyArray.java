package designpattern.Behavioral.iteratorpattern.ViduMau;

public class MyArray {

    private int[] mang = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public int getItem(int i) {
        return mang[i];
    }

    public int count() {
        return mang.length;
    }

    public MyIterator createIterator() {
        return null;
    }
}
