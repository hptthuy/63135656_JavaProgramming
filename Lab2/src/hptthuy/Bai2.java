//LAB2:KIỂU, TOÁN TỬ, LỆNH IF VÀ SWITCH
package hptthuy;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập a:");
		double a =scanner.nextDouble();
		System.out.println("nhập b:");
		double b = scanner.nextDouble();
		System.out.println("nhập c:");
		double c =scanner.nextDouble();
		
		if (a == 0) 
		{
            // ptb1
            if (b == 0)
            {
                if (c == 0)
                {
                    System.out.println(" vô số nghiệm");
                } 
                else
                {
                    System.out.println("vô nghiệm");
                }
            } 
            	else 
            		{
            			double x = -c / b;
            			System.out.println("Nghiệm của phương trình là: " + x);
            		}
        } 
				else
					{
						// ptb2
						double delta = b * b - 4 * a * c;
						if (delta < 0) 
						{
						System.out.println(" vô nghiệm.");
						} 
						else if (delta == 0) 
						{
							double x = -b / (2 * a);
							System.out.println("Nghiệm kép của phương trình là: " + x);
						} 
						else 
						{
							double x1 = (-b + Math.sqrt(delta)) / (2 * a);
							double x2 = (-b - Math.sqrt(delta)) / (2 * a);
							System.out.println("Nghiệm của phương trình là: x1 = " + x1 + ", x2 = " + x2);
		
						}

					}
	}
}





//Viết chương trình cho phép giải phương trình bậc hai trong đó các hệ số a, b và c nhập từ bàn phím
//✓ Nhập a, b và c
//✓ Xét a
//o Nếu a== 0 => giải phương trình bậc nhất
//o Ngược lại (a != 0)
//▪ Tính delta
//▪ Biện luận theo delta
//• Delta < 0: vô nghiệm
//• Delta = 0: nghiệm kép x = -b/(2*a)
//• Delta > 0: 2 nghiệm phân biệt
///o X1 = (-b+căn(delta))/(2*a)
//o X2 = (-b-căn(delta))/(2*a)