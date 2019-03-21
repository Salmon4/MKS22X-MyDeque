public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    size = 10;
    start = 0;
    end = 9;
    data = (E[])new Object[10];
  }
  public MyDeque(int initialCapacity){
    size = initialCapacity;
    start = 0;
    end = initialCapacity-1;
    data = (E[])new Object[initialCapacity];
  }
  public int size(){
    return size;
  }
  public String toString(){
    String ans = "";
    for (int i = 0; i < size - 1; i++){
      ans += data[i] + ", ";
    }
    ans += data[size-1];
    return ans;
  }
  public void addFirst(E element){

  }
  public void addLast(E element){

  }
  public E removeFirst(E element){

  }
  public E removeLast(E element){

  }
  public E getFirst(E element){

  }
  public E getLast(E element){

  }
}
