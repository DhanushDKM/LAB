/*
  @Author : Dhanush Kumar M
  Date : 15/09/2022
  Title : Java Program
  Question : Join Threads: Finish until thread finishes execution, then progress
         * the code Reminder: your method is also a thread so without joining
         * threads System.out.println("Count is: " + count); will work
         * immediately. Join does not terminate Thread 2, just progress of the
         * code stops until Threads terminate.
  
*/



import java.util.logging.Level;
import java.util.logging.Logger;
public class lab 
{

private int count = 0;

public static void main(String[] args) 
{
lab worker = new lab();
worker.print();
}
public synchronized void increment(String threadName) throws InterruptedException 
{
count++;
//Thread.sleep(1000);
System.out.println("Thread in Progress: " + threadName + " and count is: " + count);
}

public void print() 
{
Thread thread1 = new Thread(new Runnable()
{
public void run() 
{
for (int i = 0; i < 10; i++) 
{
try 
{
increment(Thread.currentThread().getName());
} 
catch (InterruptedException ex) 
{
Logger.getLogger(lab.class.getName()).log(Level.SEVERE, null, ex);
}
}
}
});
thread1.start();
Thread thread2 = new Thread(new Runnable() 
{
public void run() 
{
for (int i = 0; i < 10; i++) 
{
try 
{
increment(Thread.currentThread().getName());
} 
catch (InterruptedException ex) 
{
Logger.getLogger(lab.class.getName()).log(Level.SEVERE, null, ex);
}
}
}
});
thread2.start();
try {
thread1.join();
thread2.join();
} 
catch (InterruptedException ignored) {}
System.out.println("Count is: " + count);
}
}