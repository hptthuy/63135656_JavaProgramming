package hptthuy;

import java.security.PublicKey;
import java.util.Scanner;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    // Constructor
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    // Phương thức tính thuế nhập khẩu
    public double getThueNhapKhau() {
        return 0.1 * donGia;
    }

    // Phương thức xuất thông tin ra màn hình
    public void xuatThongTin() {
        System.out.println("Thông tin sản phẩm:");
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin từ người dùng
        System.out.print("Nhập tên sản phẩm: ");
        String tenSp = scanner.next();

        System.out.print("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();

        System.out.print("Nhập giảm giá: ");
        double giamGia = scanner.nextDouble();

        // Tạo đối tượng SanPham
        SanPham sanPham = new SanPham(tenSp, donGia, giamGia);

        // Xuất thông tin sản phẩm
        sanPham.xuatThongTin();
    }
}
