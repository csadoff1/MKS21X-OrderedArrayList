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

}
