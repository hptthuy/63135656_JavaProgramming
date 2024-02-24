package hptthuy;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println( " nhập hệ số a: ");
		double a =  scanner.nextDouble();
		System.out.println("nhập hệ số b: ");
		double b = scanner.nextDouble();
		//System.out.println("nhập hệ số x ");
		//double x =scanner.nextDouble();
		
		if(a == 0)
		{
			if(b == 0)
			{
			System.out.println("vô số nghiệm");
			}
			
			else
			{
				System.out.println("vô nghiệm");
			}
		}
			
			 else
			{
			double x = -b / a;
            System.out.println("Nghiệm của phương trình là: " + x);
			}
			
		}
	}
	


