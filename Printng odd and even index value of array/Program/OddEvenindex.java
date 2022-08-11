/*
@Author : Dhanush Kumar M
Date : 11/08/2022
Title : Array Program
Question : Printing odd and even index value of array.
*/
class OddEvenindex
{    
        static int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};   
        public static void main(String[] args) 
		{  
            System.out.println("odd index value: "); 
	 	    for (int i = 0; i < arr.length; i = i+2) 
		        {   
                   System.out.println(arr[i]);   
                }
            System.out.println("even index value: "); 
	 	    for (int i = 1; i < arr.length; i = i+2) 
		        {   
                   System.out.println(arr[i]);   
                }
		}
}		