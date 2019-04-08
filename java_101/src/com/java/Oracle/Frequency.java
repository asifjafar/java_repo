package com.java.Oracle;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by prasun.pallav on 12/12/2018.
 */
public class Frequency {
    public static void main(String args[]) {
        String st = "Aaaaabbcccdddddd";
        char c[] = st.toCharArray();
        HashMap m = new HashMap();
        HashSet s = new HashSet();
        for (int i = 0; i < c.length; i++) {
            if (s.add(c[i]))
                m.put(c[i], 1);
            else {
                Object v = m.get(c[i]);
                int x = (int) v;
                m.put(c[i], ++x);
            }
        }
        System.out.println(m);
    }
}
