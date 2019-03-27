public class Calculator{
  /*Evaluate a postfix expression stored in s.
 *Assume valid postfix notation, separated by spaces.
 */
 @SuppressWarnings("unchecked")
 public static double eval(String s){
   String[] stack = s.split(" ");
   //for (int i = 0; i < stack.length; i++){
   //System.out.println(stack[i]);
 //}
  MyDeque<Double> numb = new MyDeque();
  //MyDeque<Double> opera = new MyDeque();

  for (int i = 0; i < stack.length; i++){
    if (stack[i] == "+"){
      numb.addLast(numb.removeLast() + numb.removeLast());
    }
    else{
      if (stack[i] == "-"){
        numb.addLast(numb.removeLast() - numb.removeLast());
      }
      else{
        if (stack[i] == "*"){
          numb.addLast(numb.removeLast() * numb.removeLast());
        }
        else{
          if (stack[i] == "/"){
            numb.addLast(numb.removeLast() / numb.removeLast());
          }
          else{
            if (stack[i] == "%"){
              numb.addLast(numb.removeLast() % numb.removeLast());
            }
            else{
              numb.addLast((double)stack[i]);
            }
          }
        }
      }
    }
  }
  return numb.getFirst();
 }

 public static void main(String args[]){
   System.out.println(eval("w o r k s"));
 }
}
