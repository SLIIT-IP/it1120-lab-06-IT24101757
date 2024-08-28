import java.util.Scanner;
public class IT24101757Lab6Q1
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
    double num, square, square_root;
	
	System.out.print("Enter a number: ");
	num = input.nextDouble();
	
	if(num > 0)
	{
		square = num * num;
		square_root = Math.sqrt(num);
		System.out.println("The square of "+ num + " is: " + square);
		System.out.println("The square root of "+ num + " is: " + square_root);
    }
	else
	{
		square = num * num;
		System.out.println("It is a complex number !");
		System.out.println("The square of "+ num + " is: " + square);
	}	
	}
}