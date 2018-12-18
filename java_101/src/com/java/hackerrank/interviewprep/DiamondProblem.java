package com.java.hackerrank.interviewprep;

public class DiamondProblem implements C {

    @Override
    public void display(String param) {
        System.out.println("Interface of type "+param);
    }

    public static void main(String args[]){
        B demoB= new DiamondProblem();
        A demoA = new DiamondProblem();
        C demoC = new DiamondProblem();
        demoA.display("A");
        demoB.display("B");
        demoC.display("C");
    }
}

interface A {
    void display(String param);
}

interface B {
    void display(String param);
}

interface C extends A, B {
    void display(String param);
}


