package hptthuy;

import java.util.Scanner;

public class Bai2 
// Viết chương trình xuất ra màn hình bảng cửu chương
/* */

{

	public static void main(String[] args) 
	{
        for (int i = 1; i <= 9; i++) // i +=2 : nếu muốn bước nhảy lên 2
        {
            System.out.println("Bảng cửu chương " + i + ":");
            for (int j = 1; j <= 10; j++) 
            {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
            System.out.println(); 
        }
    }
}


