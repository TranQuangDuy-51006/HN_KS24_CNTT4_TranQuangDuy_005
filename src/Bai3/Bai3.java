package Bai3;

import java.util.Scanner;
import java.util.Stack;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length() == 0){
            System.out.println("Bieu thuc khong hop le!!!");
            return;
        }
        Stack stack = new Stack();
        boolean check = false;
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(c.equals("[") || c.equals("{") || c.equals("(")){
                stack.push(str.charAt(i));
            } else if (c.equals("]") || c.equals("}") || c.equals(")")) {
                String checkPop = stack.pop().toString();
                if(checkPop.equals("[") && c.equals("]")){
                    check = true;
                } else if (checkPop.equals("{") && c.equals("}")) {
                    check = true;
                } else if (checkPop.equals("(") && c.equals(")")) {
                    check = true;
                }else{
                    check = false;
                    break;
                }
            }
        }
        System.out.println(check);

    }

}
