public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList() {
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T value) {
    for (int i=0; i<this.size(); i++) {
      if (this.get(i).compareTo(value) >= 0) super.add(i, value);
    }
    return true;
  }

  public void add(int index, T value) {
    for (int i=0; i<this.size(); i++) {
      if (this.get(i).compareTo(value) >= 0) super.add(i, value);
    }
  }

  public T set(int index, T value) {
    T oldVal = this.get(index);
    this.remove(index);
    this.add(index, value);
    return oldVal;
  }

}
