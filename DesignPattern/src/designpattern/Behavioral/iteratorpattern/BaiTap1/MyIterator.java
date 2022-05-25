package designpattern.Behavioral.iteratorpattern.BaiTap1;

public abstract class MyIterator {
    abstract Object First();
    abstract Object Next();
    abstract boolean IsDone();
    abstract Object CurrentItem();
}
