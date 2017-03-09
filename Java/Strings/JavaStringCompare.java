//  https://www.hackerrank.com/challenges/java-string-compare

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int k=sc.nextInt();
        
        //intialising substrings
        String max=a.substring(0,k);
        String min=a.substring(0,k);
        
        //looping through all the possible substrings e.g.for k=3 ... 0-3 ,1-4 , 2-5 .......etc
        for(int i=0;i+k<=a.length();i++){
        if(a.substring(i,i+k).compareTo(min)<0)
            min=a.substring(i,i+k);
            
        if(a.substring(i,i+k).compareTo(max)>0)
            max=a.substring(i,i+k);
       
        }
        
        System.out.println(min); 
        System.out.println(max);
    }
}
