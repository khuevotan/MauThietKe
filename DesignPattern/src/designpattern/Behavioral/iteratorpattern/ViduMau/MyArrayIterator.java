package designpattern.Behavioral.iteratorpattern.ViduMau;

public class MyArrayIterator implements MyIterator {

    MyArray arrayAggregate;
    int index = 0;

    public MyArrayIterator(MyArray arrayAggregate) {
        this.arrayAggregate = arrayAggregate;
    }

    @Override
    public Object First() {
      return null;
    }

    @Override
    public Object Next() {
        if(!isDone())
            return arrayAggregate.getItem(++index);
        return null;
    }

    @Override
    public boolean isDone() {
      return !(index < arrayAggregate.count());
    }

    @Override
    public Object CurrentItem() {
       return null;
    }
}
