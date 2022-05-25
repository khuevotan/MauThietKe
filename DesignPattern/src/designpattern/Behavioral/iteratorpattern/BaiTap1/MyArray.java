package designpattern.Behavioral.iteratorpattern.BaiTap1;

public class MyArray {
    private int[] soNguyen = {};

    public MyArray(int[] soNguyen) {
        this.soNguyen = soNguyen;
    }

    public int getItem(int i) {
        return soNguyen[i];
    }

    public int count() {
        return soNguyen.length;
    }
    
        public MyIterator CreateIterator() {
        return new MyArrayIterator(this);
    }
}
