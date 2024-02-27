package hptthuy;

import java.lang.reflect.Array;
import java.util.Scanner;
// Viết chương trình nhập mảng số nguyên từ bàn phím 
/*  Viết chương trình nhập mảng số nguyên từ bàn phím.
✓ Sắp xếp và xuất mảng vừa nhập ra màn hình.
✓ Xuất phần tử có giá trị nhỏ nhất ra màn hình
✓ Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3*/
/* Gợi ý các bước làm 
 - Nhập số lượng phần tử của mảng trước
 - Khởi tạo mảng với số phần tử ( gọi số phần tử là "n" )
 - Nhập giá trị cho từng phần tử của mảng bằng cách lập vòng lặp For
 - Sắp xếp mảng / tìm và xuất giá trị nhỏ nhất của mảng 
 - Tính và xuất trung bình cộng của các phần tử chia hết cho 3 ra màn hình */
import java.util.concurrent.CountDownLatch;


public class Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// nhập số lượng phần tử của mảng
		System.out.println("Nhập số lượng phần tử của mảng:");
		int n = scanner.nextInt();
		// khởi tạo mảng với số phần tử là "n"
		int [] mang = new int [n];
		// Nhập giá trị cho từng phần tử của mảng bằng cách lập vòng lặp For
		for( int i =0; i <n ; i ++)
		{
			System.out.println(i + " ");
		}
		System.out.println( );
		
		
		// tìm và in ra giá trị nhỏ nhất
		int min = mang[0]; // gán giá trị đầu tiên của mảng trở thành giá trị nhỏ nhất 
		for ( int i = 0; i < n ; i ++) // cho chạy vòng lặp bắt đầu bằng giá trị nhỏ nhất đến n số trong mảng
			min = Math.min(min, mang[i]); // ( Math.min là cú pháp để tìm giá trị nhỏ nhất ), và để trong ngoặc () 2 giá trị cần so sánh
		System.out.println("giá trị nhỏ nhất của mảng là : " + min); // sau đó in ra giá trị nhỏ nhất 
		
		// tìm và xuất ra màn hình trung bình cộng của các phần tử chia hết cho 3 trongmảng
		/*  Duyệt mảng và kiểm tra từng phần tử. Nếu phần tử thứ i chia hết cho 3 
		   (a[i] % 3 == 0) thì thực hiện
			o Cọng vào tổng
			o Tăng số đếm các số chia hết cho 3
			Lấy tổng chia cho số đếm bạn sẽ có kết quả */ 
		int[] arr = new int[n];
		int sum = 0;
		int count = 0;
		for ( int i =0; i < n ; i ++) 
		{
			if (arr[i] %3 ==0) 
			{
				sum += arr[i] ;
				count ++; 
				
			}
			if ( count > 0) {
				double trungbinh = (double) sum / count;
				System.out.println("Số phần tử chia hết cho 3 trong mảng :" + trungbinh);
			}
			else 
				System.out.println(" Không có phần tử nào chia hết cho 3 trong mảng ");
			break;
		}
	}

}
