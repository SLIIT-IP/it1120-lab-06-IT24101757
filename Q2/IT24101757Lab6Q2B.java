import java.util.Scanner;

public class IT24101757Lab6Q2B
{
	public static void main(String[] args)
	{
		int count, no;
		
		Scanner input = new Scanner(System.in);
		
		count = 0;
		no = 1;
		
		int[] num = new int[10]; //Store the 10 values in num;
		
		System.out.println("Please enter 10 numbers:");
		
		while(count < 10)
	    {
			System.out.print("Enter number "+ no +":");
		    num[count] = input.nextInt(); //read inputs and store in the array;
			
			no++;
            count++;
		}
		
		System.out.println("The numbers you entered are: ");
		
		for(int i = 0; i < 10; i++) //for print the inputs;
		{
    		System.out.print(num[i] + " ");
		}
		
	}
}
