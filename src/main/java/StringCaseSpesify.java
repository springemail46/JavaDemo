package main.java;

import java.util.Collections;
import java.util.Vector;

public class StringCaseSpesify {

    public static void main(String[] args) {
    StringBuilder str = new StringBuilder("abZzEbHAsc");
        Vector<Character> v1 = new Vector<>();
        Vector<Character> v2 = new Vector<>();
    for(int i =0; i< str.length();i++){
        if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
            v1.add(str.charAt(i));
        }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
            v2.add(str.charAt(i));
        }
    }
        Collections.sort(v1);
        Collections.sort(v2);
        int a =0, b = 0;
        for(int i =0; i < str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                str.setCharAt(i, v1.elementAt(a));
                ++a;
            }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                str.setCharAt(i, v2.elementAt(b));
                ++b;
            }
        }
        System.out.println(str.toString());
    }

}
