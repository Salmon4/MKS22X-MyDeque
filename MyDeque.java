import java.util.NoSuchElementException;
public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    size = 0;
    start = 0;
    end = 9;
    data = (E[])new Object[10];
  }
  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    size = 0;
    start = 0;
    end = initialCapacity-1;
    data = (E[])new Object[initialCapacity];
  }
  public int size(){
    return size;
  }
  public String toString(){
    String ans = "";
    for (int i = start; i < end + 1; i++){
      ans += data[i] + " ";
    }
    //ans += data[size-1];
    return ans;
  }
  public void addFirst(E element){
    if (element == null){
      throw new NullPointerException("boo");
    }
    if (start - 1 >= 0){
      start--;
      size++;
      data[start] = element;
    }
  }
  public void addLast(E element){
    if (element == null){
      throw new NullPointerException("boo");
    }
    if (end + 1 < data.length){
      end++;
      size++;
      data[end] = element;
    }
  }
  public E removeFirst(){
    if (data[start] == null){
      throw new NoSuchElementException("boo");
    }
    E ans = data[start];
    data[start] = null;
    start++;
    return ans;
  }
  public E removeLast(){
    if (data[end] == null){
      throw new NoSuchElementException("boo");
    }
    E ans = data[end];
    data[end] = null;
    end--;
    return ans;
  }
  public E getFirst(){
    if (data[start] == null){
      throw new NoSuchElementException("boo");
    }
    return data[start];
  }
  public E getLast(){
    if (data[start] == null){
      throw new NoSuchElementException("boo");
    }
    return data[end];
  }
}
