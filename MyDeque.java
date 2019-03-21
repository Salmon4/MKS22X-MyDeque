public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    size = 10;
    start = 0;
    end = 9;
    data = new E[10];
  }
  public MyDeque(int initialCapacity){
    size = initialCapacity;
    start = 0;
    end = initialCapacity-1;
    data = new E[initialCapacity];
  }
  public int size(){

  }
  public String toString(){

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
