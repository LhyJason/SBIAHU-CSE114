
import java.util.Scanner;

class MyStack extends java.util.ArrayList<Object> {
  /** boolean, Returns true if this stack is empty */
  public boolean isEmpty() {
    return super.isEmpty();
  }

  /** int, Returns the number of elements in this stack */
  public int getSize() {
    return size();
  }

  /** Object, Returns the top element in this stack without removing it */
  public Object peek() {
    return get(getSize() - 1);
  }

  /** Object, Returns and removes the top element in this stack. */
  public Object pop() {
    return remove(getSize() - 1);
  }

  /** void, Adds a new element to the top of this stack */
  public void push(Object o) {
    add(o);
  }

  /** reverse */
  public static void Reverse() {

  }
}

// test program
public class Exercise11_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MyStack stack = new MyStack();

    for (int i = 0; i < 5; i++) {
      stack.push(sc.next());
    }
    System.out.println();
    for (int i = 0; i < 5; i++) {
      if (i == 4) {
        System.out.print(stack.pop());
      } else {
        System.out.print(stack.pop() + " ");
      }
    }
  }
}
