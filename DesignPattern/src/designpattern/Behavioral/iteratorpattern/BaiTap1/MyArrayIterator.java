package designpattern.Behavioral.iteratorpattern.BaiTap1;

public class MyArrayIterator extends MyIterator {
    MyArray arrayAggregate;
    int index = 0;

    public MyArrayIterator(MyArray soNguyen) {
        this.arrayAggregate = soNguyen;
    }

    @Override
    Object First() {
        return arrayAggregate.getItem(index);
    }

    @Override
    Object Next() {
        if (!IsDone())
            return arrayAggregate.getItem(++index);
        return null;
    }

    @Override
    boolean IsDone() {
        return !(index < arrayAggregate.count() - 1);
    }

    @Override
    Object CurrentItem() {
        return arrayAggregate.getItem(index);
    }
}
