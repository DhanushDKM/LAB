/*
@Author : Dhanush Kumar M
Date : 06/08/2022
Title : Array Program
Question : Printing the middle value using array.
*/
class array4
{
	public static void main(String[]args)
	{
        int[]arrvalue = {10, 11, 14, 19, 17, 33};
        int num = (arrvalue.length) / 2;
        if (num%2 == 0) 
		{
            for (int i=(num - 1); i <= num; i++) 
			{
                System.out.println(arrvalue[i]);
            }
        }else 
		    {
                System.out.println(arrvalue[num]);
            }
	}
}