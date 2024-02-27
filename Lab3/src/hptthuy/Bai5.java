package hptthuy;

import java.util.Scanner;
public class Bai5

{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời nhập 1 số bất kì để kiểm tra ( là số nguyên dương N: ");
		int N = scanner.nextInt();
		boolean ok = true;
		if ( N<=1)
			ok = false;
		else
		{
			for( int i =2; i <=Math.sqrt(i); i ++) 
			{
				if( N %i==0)
				{
					ok = false;
					break;
				}
			}
			
		}
		if(ok) 
			System.out.println("Số bạn vừa nhập là số nguyên tố");
		else 
			System.out.println("Số bạn vừa nhập không phải là số nguyên tố");
	}

}
