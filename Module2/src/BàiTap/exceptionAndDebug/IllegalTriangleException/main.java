package BàiTap.exceptionAndDebug.IllegalTriangleException;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();

        try {
            Triangle triangle = new Triangle(a, b, c);
            System.out.println("Tạo tam giác thành công!");
            System.out.println(triangle);
        } catch (IllegalTriangleException e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
    }
}
