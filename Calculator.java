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
    System.out.println(numb.toString());
    if (stack[i].equals("+")){
      numb.addLast(numb.removeLast() + numb.removeLast());
    }
    else{
      if (stack[i].equals("-")){
        numb.addLast(numb.removeLast()*-1 + numb.removeLast());
      }
      else{
        if (stack[i].equals("*")){
          numb.addLast(numb.removeLast() * numb.removeLast());
        }
        else{
          if (stack[i].equals("/")){
            double d1 = numb.removeLast();
            double d2 = numb.removeLast();
            numb.addLast(d2 / d1);
          }
          else{
            if (stack[i].equals("%")){
              double r1 = numb.removeLast();
              double r2 = numb.removeLast();
              numb.addLast(r2 % r1);
            }
            else{
              numb.addLast(Double.parseDouble(stack[i]));
            }
          }
        }
      }
    }
  }
  System.out.println(numb.toString());
  return numb.getFirst();
 }

 public static void main(String args[]){
   System.out.println(eval("10 2.0 +"));
   System.out.println(eval("11 3 - 4 + 2.5 *"));
   System.out.println(eval("8 2 + 99 9 - * 2 + 9 -"));
   System.out.println(eval("1 2 3 4 5 + * - -"));
 }
}
