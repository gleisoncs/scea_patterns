package j2ee.architect.gof.Iterator;
import java.util.*;
public class ConcreteCollection implements CollectionIF {
  // Builds an iterable list of elements
  private List list = new ArrayList();
  public ConcreteCollection(Object[] objectList) {
    for (int i=0; i < objectList.length; i++) {
      list.add(objectList[i]);
    }
  }
  public IteratorIF iterator() {
    return new ConcreteIterator(this);
  }
  public Collection elements() {
    return Collections.unmodifiableList(list);
  }
}