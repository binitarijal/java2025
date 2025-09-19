
// import java.util.Stack;

// public class StackExample {
//     public static void main(String[] args) {
//         Stack<Integer> stack = new Stack<>();

//         // push
//         stack.push(10);
//         stack.push(20);
//         stack.push(30);

//         // peek
//         System.out.println("Top element: " + stack.peek()); // 30

//         // pop
//         System.out.println("Removed: " + stack.pop()); // 30

//         // check empty
//         System.out.println("Is stack empty? " + stack.isEmpty()); // false
//     }
// }


import java.util.Stack;

public class StackExample {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expr = "{[()]}";
        System.out.println(isBalanced(expr) ? "Balanced" : "Not Balanced");
    }
}

