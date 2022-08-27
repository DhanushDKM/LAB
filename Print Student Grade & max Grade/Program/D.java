/*

  @Author : Dhanush Kumar M
  Date : 27/08/2022
  Title : Java Program
  Question :
  Write a program that reads student scores, gets the best score, and then
  assigns grades based on the following scheme:
  Grade is A if score is >= best - 10
  Grade is B if score is >= best - 20
  Grade is C if score is >= best - 30
  Grade is D if score is >= best - 40
  Grade is F otherwise
  The program prompts the user to enter the total number of students, then
  prompts the user to enter all of the scores, and concludes by displaying
  the grades.
*/
import java.util.Scanner;
class D
{
	static int best = 100;
	static char grade;
	static int max;
	static char g;
	/* Main method */
	public static void main(String[] args) 
	{
		// Prompt the user to enter the total number of students
		System.out.print("Enter the number of students:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int score[] = new int[n];
	// Prompt the user to enter all the scores
    System.out.print("Enter " + n + " scores:");
 
        for (int i = 0; i < score.length; i++) 
		{
            score[i] = input.nextInt();
        }
        /* Assigns grades based on grading scheme */
        for (int i = 0; i < score.length; i++) {
            
			if (score[i] >= best - 10){
                grade = 'A';
			}
            else if (score[i] >= best - 20){
				grade = 'B';
			}	
            else if (score[i] >= best - 30){
				grade = 'C';
			}	
            else if (score[i] >= best - 40){
				grade = 'D';
            }
			else{
                grade = 'F';
            }
		// Display results	
        System.out.println("Student " + i +" score is " + score[i] +" and grade is " + grade);
		}
        {  
		    /* Returns the is highest score */
		    for (int i = 0; i < score.length; i++){
			if(score[i] > max) {
                  max = score[i];				
		    }		
        }  
		if(max >= 90){
			g='A';
		}
        else if(max >= 80){
			g='B';
		} 
        else if(max >= 70){
			g='C';
		} 
		else if(max >= 60){
			g='D';
		}
        else{
            g='F';
		}
        // Display results			
		System.out.println("maximum score is " + max +" and Grade is "+ g );
    }
}	
}
