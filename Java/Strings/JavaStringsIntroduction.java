// https://www.hackerrank.com/challenges/java-strings-introduction

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
       // Code for total length
        System.out.println(A.length()+B.length());
         
       //for yes or no
        if(A.compareTo(B)>0)
            System.out.println("Yes");
        else
            System.out.println("No");
        
       //for upper case     
       System.out.println( A.substring(0, 1).toUpperCase().concat(A.substring(1))+" "+B.substring(0,          1).toUpperCase().concat(B.substring(1)));
        
    }
}
