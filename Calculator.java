public class Calculator{
  /*Evaluate a postfix expression stored in s.
 *Assume valid postfix notation, separated by spaces.
 */
 @SuppressWarnings("unchecked")
 public static double eval(String s){
   String[] stackS = s.split(" ");
   //for (int i = 0; i < stack.length; i++){
   //System.out.println(stack[i]);
 //}
  MyDeque numb = new MyDeque();
  MyDeque opera = new MyDeque();
  for (int i = 0; i < stackS.length; i++){
    if (stackS[i] == "+"){
      opera.addLast(stackS[i]);
    }
    if (stackS[i] == "-"){
      opera.addLast(stackS[i]);
    }
    if (stackS[i] == "*"){
      opera.addLast(stackS[i]);
    }
    if (stackS[i] == "/"){
      opera.addLast(stackS[i]);
    }
    numb.addLast(stackS[i]);
  }
  for (int i = 0; numb.size() != 1; i++){
    if (opera.removeFirst().equals("+")){
      numb.addFirst(numb.removeFirst() + numb.removeFirst());
    }
    if (opera.removeFirst() == "-"){
      numb.addFirst(numb.removeFirst() - numb.removeFirst());
    }
    if (opera.removeFirst() == "*"){
      numb.addFirst(numb.removeFirst() * numb.removeFirst());
    }
    if (opera.removeFirst() == "/"){
      numb.addFirst(numb.removeFirst() / numb.removeFirst());
    }
    i--;
  }
  return numb.getFirst();
 }

 public static void main(String args[]){
   System.out.println(eval("w o r k s"));
 }
}
