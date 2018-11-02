import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList() {
  }

  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public T set(int i, T value) {
    T oldVal = this.get(i);
    if (value == null) {
      throw new IllegalArgumentException("cannot set null value");
    }
    else {
      super.set(i, value);
    }
    return oldVal;
  }

  public boolean add(T value) {
    if (value == null) {
      throw new IllegalArgumentException("cannot add null value");
    }
    else {
      super.add(value);
    }
    return true;
  }

  public void add(int i, T value) {
    if (value == null) {
      throw new IllegalArgumentException("cannot add null value");
    }
    else {
      super.add(i, value);
    }
  }

}
