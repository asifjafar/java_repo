package com.java.hackerrank.interviewprep;

import java.util.*;

public class DiamondProblem implements C {

    @Override
    public void display(String param) {
        System.out.println("Interface of type "+param);
    }

    public static void main(String args[]){
        try {
            B demoB = new DiamondProblem();
            A demoA = new DiamondProblem();
            C demoC = new DiamondProblem();
            demoA.display("A");
            demoB.display("B");
            demoC.display("C");
            String ef = "dfs";
            ef.toCharArray();
           int u=  1/0;
            ef.intern();
            List<Integer> list = new ArrayList<>();

            Collections.sort(null, new Comparator<DiamondProblem>() {
                @Override
                public int compare(DiamondProblem o1, DiamondProblem o2) {
                    return 0;
                }
            });

        }catch (Exception e){

        }finally {

        }
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


