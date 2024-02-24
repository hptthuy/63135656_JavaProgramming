package hptthuy;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. giải phương trình bậc nhất");
		System.out.println("2. giải phương trình bậc 2");
		System.out.println("3. tính tiền điện");
		System.out.println("4. kết thúc");
		System.out.println("nhập lựa chọn của bạn");
		 int chon =scanner.nextInt();
		
	do 
			{
        System.out.print("Nhập lựa chọn (1-4): ");
            } 
	while (chon < 1 || chon > 4);

        return chon;
	}

}
// Viết chương trình tổ chức 1 menu gồm 3 chức năng để gọi 3 bài trên và một chức năng để thoát khỏi ứng dụng.
//✓ Tạo phương thức menu() xuất ra màn hình thực đơn như sau
//1. Giải phương trình bậc nhất
//2. Giải phương trình bậc 2
//3. Tính tiền điện
//4. Kết thúc
//Chọn chức năng: _
//✓ Viết mã vào phương thức menu để nhận vào 1 số từ 1 đến 4.
//✓ Sử dụng lệnh switch để gọi đến các hàm chức năng tương ứng.
//o giaiPTB1()
//Chứa mã của bài 1
//o giaiPTB2()
//Chứa mã của bài 2
//o tinhTienDien()
//Chứa mã của bài 3