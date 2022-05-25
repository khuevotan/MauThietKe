package designpattern.Behavioral.iteratorpattern.ViduMau;

public interface MyIterator<T> {
    public T First();
    public T Next();
    public boolean isDone();
    public T CurrentItem();
}
