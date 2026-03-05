package Bai3;

import java.util.Scanner;
import java.util.Stack;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.length() == 0) {
            System.out.println("Bieu thuc khong hop le!!!");
            return;
        }

        Stack<Character> stack = new Stack<>();
        boolean isValid = true;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            }


            else if (c == ']' || c == '}' || c == ')') {


                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }

                char top = stack.pop();

                if ((top == '[' && c != ']') ||
                        (top == '{' && c != '}') ||
                        (top == '(' && c != ')')) {
                    isValid = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            isValid = false;
        }

        System.out.println(isValid);
    }
}