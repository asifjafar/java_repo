package com.java.Oracle;

/**
 * Created by prasun.pallav on 12/26/2018.
 */
public class Stack {
    private static final int MAX = 1000;
    private int top;
    private int a[] = new int[MAX]; // Maximum size of Stack

    private Stack() {
        top = -1;
    }

    private boolean push(int x) {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top]=x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    private int pop()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            return a[top--];
        }
    }

    private void display(){
        System.out.print("Updated Array...");
        for(int i = top; i >= 0; i--){
            System.out.print(a[i]+",");
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        s.display();
    }
}
