/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Strings {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str="hi 2 all... this is istring test 1";
        String str1="hi 2 all... this is istring test 1";
        String str2="Hi 2 alL... ThiS is iString Test 1";
        
        //q1 compare strings with and without ignoring case
        System.out.println(str.compareTo(str2)+" "+str.compareToIgnoreCase(str2));
        
        //q2 -no of occurance of a string
        System.out.println("Number of occurance of is:"+(str.split("is").length-1));
        
        //q11 equals and == 
        System.out.println(str2==str);
        System.out.println(str2.equals(str));
        //eliminate all numbers
        str1=str1.replaceAll("[0-9]","");
        System.out.println(str1);
        //eliminate all given substrings in a string
        str1=str1.replaceAll("is", "");
        System.out.println(str1);
        
        //replace a char by other char
        str1=str1.replaceAll("t","x");
        System.out.println(str1);
        //split string
          String[] arr=str2.split("i");
        for(String s:arr)
        {
            System.out.println(s);
        }
        //tokenize string with delimeter
        StringTokenizer st=new StringTokenizer(str2,"i",true);
      
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
        
        //print current date
       Date date=new Date();
           SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
         System.out.println(sdf.format(date));
        
        //compare two dates
       System.out.println("Enter date");
       String d=sc.nextLine();
    
      
        try {
            if(sdf.parse(d).compareTo(sdf.parse(sdf.format(date)))<0)
            {
                System.out.println("Before");
            }
            else if(sdf.parse(d).compareTo(date)>0)
            {
                System.out.println("After");
                
            }
            else
            {
                System.out.println("Same Date");
            }
         
        } catch (ParseException ex) {
           System.out.println("Not a valid format");
        }
       
    }
}
