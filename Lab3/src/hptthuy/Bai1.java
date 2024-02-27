package hptthuy;

import java.util.Scanner;
public class Bai1
 /* gợi ý làm bài : 
   Số nguyên tố là số chỉ chia hết cho 1 và chính nó
   - Đầu tiên sẽ cho người dùng nhập 1 số bất kì 
   - Đặt tên cho số bất kì đó là N ( int N )
   - Dùng lệnh boolean để đặt tên biến " ok " là true để xét
   - Dùng if để xét : nếu N <=1, tức là sẽ ko xét các số bé hơn hoặc bằng 1, vậy biến "ok" sẽ là false
   - Dùng lệnh Else : Cho chạy vòng lặp , cho i chạy từ 2 đến < căn của i, nếu N chia hết cho i, thì "ok " là false */
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời nhập 1 số bất kì để kiểm tra ( là số nguyên dương N: ");
		int N = scanner.nextInt();
		boolean ok = true; // logic, true =1; false = 0
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
