package BàiTap.exceptionAndDebug.ArrayIndexOutOfBounds;

import java.util.Scanner;

class main {
    static void main(String[] args) {
        exceptionAndDebug.ArrayIndexOutOfBounds.arrayExample arrExample = new exceptionAndDebug.ArrayIndexOutOfBounds.arrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
