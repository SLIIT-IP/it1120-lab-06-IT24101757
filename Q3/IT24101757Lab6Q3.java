import java.util.Scanner;
public class IT24101757Lab6Q3
{
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		int num, count, sum;
		double rms;
		
		sum = 0;
		count = 0;
		
		System.out.println("Enter positive integers (terminate input with -99):");
		
		while(true)
		{
			System.out.print("Enter a number: ");
			num = input.nextInt();
			
	     	if(num == -99)
			{
				break; //terminate the program;
			}
			if(num <0)
			{
				System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
				continue; //Skip negative inputs
			}
			
			sum = sum + (num*num);
			count++;
		}

		rms = Math.sqrt((double)sum / count);

		System.out.println("The Root Mean Square (RMS) is: " + rms);	
	}
}
