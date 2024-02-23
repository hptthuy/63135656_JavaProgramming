package hptthuy;

import java.util.Scanner;

public class Bai2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("chiều dài :");
		double chieudai=scanner.nextDouble();
		System.out.println("chiều rộng");
		double chieurong=scanner.nextDouble();
		double chuvi= (chieudai + chieurong)*2;
		double dientich = ( chieudai * chieurong);
	//	System.out.println("Cạnh nhỏ nhất của hình chữ nhật:");
		double canhnhonhat = Math.min(chieudai, chieurong);		
		System.out.println("chu vi : "+ chuvi);
		System.out.println("diện tích: "+ dientich);
		System.out.println("cạnh nhỏ nhất "+ canhnhonhat);
		
		
	}

}
