import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList() {

  }
  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }
}
