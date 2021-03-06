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
    if (size == 0){
      return "{}";
    }
    if (size == 1){
      ans += "{";
      ans += data[start];
      ans += " }";
      return ans;
    }
    ans += "{";
    //System.out.println(start + " " + end + "  " + size);
    if (start < end){
      for (int i = start; i <= end; i++){
        if (data[i] != null){
        ans += data[i] + " ";
      }
      }
    }
    else{
      for (int i = start; i < data.length; i++){
        //System.out.println(data[i]);
        if (data[i] != null){
        ans += data[i] + " ";
      }
      }
      for (int k = 0; k <= end; k++){
        if (data[k] != null){
        ans += data[k] + " ";
      }
      }
    }

    //for (int i = 0; i < size; i++){

    //}
    //ans += data[size-1];
    ans += "}";
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
    if (end == 0 && start == 0){
      start--;
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
    if (size == data.length){
      resize();
    }

  if (data[end] == null){
    size++;
    data[end] = element;
  }
  else{
    //if (end >= data.length){
    //  end = 0;
  //  }

      end++;
      size++;
      data[end] = element;
}
  }


  public E removeFirst(){
    //if (data[start] == null){
    //  throw new NoSuchElementException("boo");
    //}

    if (size == 0){
      throw new NoSuchElementException("boo");
    }
    if (data[start] == null){
      throw new NullPointerException("boo");
    }
    E ans = data[start];
    if (start < data.length - 1){
      data[start] = null;
      start++;
      size--;
    }
    else{
      data[start] = null;
      size--;
      start = 0;
    }
    return ans;
  }
  public E removeLast(){
    if (size == 0){
      throw new NoSuchElementException("boo");
    }
    if (data[end] == null){
      throw new NullPointerException("boo");
    }
    E ans = data[end];
    if (end == 0){
      data[end] = null;
      end = size - 1;
      size--;
    }
    else{
      data[end] = null;
      size--;
      end--;
    }
    return ans;
  }
  public E getFirst(){
    if (size == 0){
      throw new NoSuchElementException("boo");
    }

    return data[start];
  }
  public E getLast(){
    if (size == 0){
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
      for (int k = 0; k <= end2; k++){
        newData[index] = data[k];
        index++;
      }
      start = -1;
      end = size-1;
    }
      data = newData;
  }
  @SuppressWarnings("unchecked")
  public static void main(String args[]){
    MyDeque<Integer> data = new MyDeque<>();
    System.out.println(data.size());
    System.out.println(data.toString());
    data.addFirst(0);
    System.out.println(data.toString());
    data.addLast(1);
    System.out.println(data.toString());
    data.addFirst(-1);
    System.out.println(data.getFirst());
    System.out.println(data.toString());
    data.addLast(2);
    System.out.println(data.getLast());
    System.out.println(data.toString());
    data.removeFirst();
    System.out.println(data.toString());
    data.removeLast();
    System.out.println(data.toString());
    data.removeLast();
    System.out.println(data.toString());
    data.removeFirst();
    System.out.println(data.toString());
    /**
    data.addFirst(0);
    System.out.println(data.toString());
    data.removeFirst();
    System.out.println(data.toString());
    data.addLast(1);
    System.out.println(data.toString());
    data.addLast(0);
    System.out.println(data.toString());
    data.removeLast();
    System.out.println(data.toString());
    data.addLast(0);
    System.out.println(data.toString());
    data.addLast(0);
    System.out.println(data.toString());
    data.removeFirst();
    System.out.println(data.toString());
    **/
    /**
    System.out.println(data.toString());
    data.addLast(10);
    System.out.println(data.toString());
    data.addLast(9);
    System.out.println(data.toString());
    data.addLast(8);
    System.out.println(data.toString());
    data.addLast(7);
    System.out.println(data.toString());
    data.addLast(6);
    System.out.println(data.toString());
    data.addLast(5);
    System.out.println(data.toString());
    data.addLast(4);
    System.out.println(data.toString());
    data.addLast(3);
    System.out.println(data.toString());
    data.addLast(2);
    System.out.println(data.toString());
    data.addLast(1);
    System.out.println(data.toString());
    data.addLast(0);
    System.out.println(data.toString());
    System.out.println(data.getLast());

    System.out.println(data.toString());
    data.addFirst(10);
    System.out.println(data.getFirst());
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
    //System.out.println(data.size());
    data.removeFirst();
    System.out.println(data.toString());
    data.removeFirst();
    System.out.println(data.toString());
    data.removeFirst();
    System.out.println(data.toString());
    data.removeFirst();
    System.out.println(data.toString());
    data.removeFirst();
    System.out.println(data.toString());
    data.removeFirst();
    System.out.println(data.toString());
    data.removeFirst();
    System.out.println(data.toString());
    data.removeFirst();
    System.out.println(data.toString());
    data.removeFirst();
    System.out.println(data.toString());
    data.removeFirst();
    System.out.println(data.toString());
    data.removeFirst();
    System.out.println(data.toString());

    data.removeLast();
    System.out.println(data.toString());

    data.removeLast();
    System.out.println(data.toString());
    data.removeLast();
    System.out.println(data.toString());
    data.removeLast();
    System.out.println(data.toString());
    data.removeLast();
    System.out.println(data.toString());
    data.removeLast();
    System.out.println(data.toString());
    data.removeLast();
    System.out.println(data.toString());
    data.removeLast();
    System.out.println(data.toString());
    data.removeLast();
    System.out.println(data.toString());
    data.removeLast();
    System.out.println(data.toString());
    data.removeLast();
    System.out.println(data.toString());
    **/
  }
}
