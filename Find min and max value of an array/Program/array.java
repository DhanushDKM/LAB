class array
{
    public static void method(int arr[])
    {
        int max = arr[0];
        int min = arr[0];
 
        for (int i = 1; i < arr.length/2; i++)
        {
            if (arr[i] > max) {
                max = arr[i];
            }
 
            else if (arr[i] < min) {
                min = arr[i];
            }
        } 
 
        System.out.println("First half min value is " + min);
        System.out.println("First half max value is " + max);
    }
	public static void method1(int arr[])
    {
		int l =arr.length/2;
		int max = arr[l];
        int min = arr[l];
 
        for (int i = (arr.length/2)+1; i < arr.length; i++)
        {
            if (arr[i] > max) {
                max = arr[i];
            }
 
            else if (arr[i] < min) {
                min = arr[i];
            }
        }
 
        System.out.println("Second half min value is " + min);
        System.out.println("Second half max value is " + max);
    }
 
    public static void main(String[] args)
    {
        int arr[] = {712 , 822, 713, 644, 554, 199, 987, 124, 589, 490};
        method(arr);
		method1(arr);
    }
}