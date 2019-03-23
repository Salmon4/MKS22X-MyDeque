import java.util.NoSuchElementException;
public class MyDeque<E>{
  private E[] data;
  private int size = 0;
  private int start = 0;
  private int end = 0;

  @SuppressWarnings("unchecked")
  public MyDeque(){
  //  @SuppressWarnings("unchecked")
    data = (E[])new Object[10];
    //size = 0;
    //start = 0;
    //end = 0;
    //@SuppressWarnings("unchecked")
    //data = (E[])new Object[10];
  }
  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
  //  @SuppressWarnings("unchecked")
    data = (E[])new Object[initialCapacity];
    //size = 0;
    //start = 0;
    //end = 0;
    //@SuppressWarnings("unchecked")
    //data = (E[])new Object[initialCapacity];
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
    if (size == data.length){
      resize();
    }
    if (start < 0){
      start = data.length - 1;
    }
    //if (start - 1 >= 0){
      start--;
      size++;
      data[start] = element;
    //}
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

  //@SuppressWarnings("unchecked")
  private void resize(){
    //@SuppressWarnings("unchecked")
    int newSize = data.length * 2 + 1;
    @SuppressWarnings("unchecked")
    E[] newData = (E[])new Object[newSize];
    for (int i = 0; i < size; i++){
      newData[i] = data[i];
    }
    data = newData;
  }
  @SuppressWarnings("unchecked")
  public static void main(String args[]){
    MyDeque data = new MyDeque();
    data.addFirst(10);
  }
}
