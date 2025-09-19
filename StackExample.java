
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // push
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // peek
        System.out.println("Top element: " + stack.peek()); // 30

        // pop
        System.out.println("Removed: " + stack.pop()); // 30

        // check empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // false
    }
}
