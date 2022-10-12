
/*
@author: Dhanush Kumar M
Date : 12/10/2022
Title : Split Words Program
Question :Take a sentence as a user input. 
Break up the sentence into words.
Sort the words based on the length of the word and print out.
*/

package com.pack2;

import java.util.Arrays;
import java.util.Comparator;
 
public class Split {
   
  static void printArrayString(String str[], int n) 
  
  {
	  
    for (int i = 0; i < n; i++)
    	
      System.out.println(str[i] + " ");
  }
 
   public static void main(String[] args) 
   
   {
	   
    String arr[] = { "Hi", "welcome", "to" ,"this" ,"mentoring","session"};
    
    int n = arr.length;
 
    Arrays.sort(arr, Comparator.comparing(s->s.length()));
 
    printArrayString(arr, n);
    
  }
   
}