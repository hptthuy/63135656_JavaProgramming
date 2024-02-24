package hptthuy;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập số điện sử dụng trong tháng:");
		int sodien = scanner.nextInt();
		int tien;
        if (sodien <= 50) 
        {
            tien = sodien * 1000;
        } 
        else 
        {
            tien = 50 * 1000 + (sodien - 50) * 1200;
        }
        System.out.println("tiền điện phải thanh toán là: " + tien);
	}
}
 //Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện theo phương pháp lũy tiến
//✓ Nếu số điện sử dụng từ 0 đến 50 thì giá mỗi số điện là 1000
//✓ Nếu số điện sử dụng trên 50 thì giá mỗi số điện vượt hạn mức là 1200
//HƯỚNG DẪN
//✓ Nếu số điện sử dụng < 50: tien = soDien*1000
//✓ Ngược lại: tien = 50*1000 + (soDien - 50)*1200