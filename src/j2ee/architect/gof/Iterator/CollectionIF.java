package j2ee.architect.gof.Iterator;
import java.util.*;
public interface CollectionIF {
  // Interface for creating a
  // collection that needs iterating.
  public IteratorIF iterator();
  public Collection elements();

}