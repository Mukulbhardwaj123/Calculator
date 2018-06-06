package com.heckercode.controller;
import com.heckercode.utilities.*;
import java.util.*;
public class Driver {
    public static void main(String argv[]) {
     Scanner sr=new Scanner(System.in);
        int a =sr.nextInt();
        int b =sr.nextInt();
        Operation obj=new Operation();
        int c = obj.add(a,b);
        System.out.println(c);
        int d = obj.sub(a,b);
        System.out.println(d);
        int m =obj.multi(a,b);
        System.out.println(m);
        int arr[]={10,2,3,5,90,4};
        SelectionSort s = new SelectionSort();
        s.sorting(arr);
    }
}
