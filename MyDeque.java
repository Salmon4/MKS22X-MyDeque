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
    ans += "{";
    System.out.println(start + " " + end);
    if (start < end){
      for (int i = start; i <= end; i++){
        ans += data[i] + " ";
      }
    }
    else{
      for (int i = start; i < data.length; i++){
        //System.out.println(data[i]);
        ans += data[i] + " ";
      }
      for (int k = 0; k < end; k++){
        ans += data[k] + " ";
      }
    }

    //for (int i = 0; i < size; i++){

    //}
    //ans += data[size-1];
    ans += "}";
    if (size == 0){
      return "{}";
    }
    return ans;
  }
  public void addFirst(E element){
    if (element == null){
      throw new NullPointerException("boo");
    }
    if (size == data.length){
      resize();
    }
    if (start <= 0){
      start = data.length;
    }
    //if (start - 1 >= 0){
  //  if (data[start] != null){
  //    start--;
    //}
      start--;
      size++;
      data[start] = element;
      //System.out.println(data.toString());
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
    int index = 0;
    int start2 = start;
    int end2 = end;
    if (start2 < end2){
      for (int i = start2; i <= end2; i++){
        newData[index] = data[i];
        index++;
      }
    }
    else{
      for (int i = start2; i < data.length; i++){
        newData[index] = data[i];
        index++;
      }
      for (int k = 0; k > 0; k--){
        newData[index] = data[k];
        index++;
      }
      start = -1;
      end = size;
    }
      data = newData;
  }
  @SuppressWarnings("unchecked")
  public static void main(String args[]){
    MyDeque data = new MyDeque();
    System.out.println(data.toString());
    data.addFirst(10);
    System.out.println(data.toString());
    data.addFirst(9);
    System.out.println(data.toString());
    data.addFirst(8);
    System.out.println(data.toString());
    data.addFirst(7);
    System.out.println(data.toString());
    data.addFirst(6);
    System.out.println(data.toString());
    data.addFirst(5);
    System.out.println(data.toString());
    data.addFirst(4);
    System.out.println(data.toString());
    data.addFirst(3);
    System.out.println(data.toString());
    data.addFirst(2);
    System.out.println(data.toString());
    data.addFirst(1);
    System.out.println(data.toString());
    data.addFirst(0);
    System.out.println(data.toString());
    System.out.println(data.size());
  }
}
