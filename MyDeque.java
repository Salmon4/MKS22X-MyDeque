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
    for (int i = start; i < end + 1; i++){
      ans += data[i] + " ";
    }
    //ans += data[size-1];
    return ans;
  }
  public void addFirst(E element){

  }
  public void addLast(E element){

  }
  public E removeFirst(){

  }
  public E removeLast(){

  }
  public E getFirst(){

  }
  public E getLast(){

  }
}
