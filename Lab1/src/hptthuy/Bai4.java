//BÀI 4 (2 ĐIỂM)
//Viết chương trình nhập các hệ số của phương trình bậc 2. Tính delta và xuất căn delta ra màn hình.

package hptthuy;

import java.util.Scanner;

public class Bai4 {
// ptb2 : ax^2 + bx + c = 0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập a");
		double a=scanner.nextDouble();
		System.out.println("nhập b");
		double b=scanner.nextDouble();
		System.out.println("Nhập c");
		double c=scanner.nextDouble();
		double delta = Math.pow(b, 2)-4 * a * c;
		System.out.println("delta là: " + delta);
		double candelta =Math.sqrt(delta);
		System.out.println("căn delta là: " + candelta);
	}

}
