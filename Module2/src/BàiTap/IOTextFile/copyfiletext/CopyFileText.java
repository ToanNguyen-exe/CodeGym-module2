package BàiTap.IOTextFile.copyfiletext;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {

    public static void copyFile(String sourcePath, String targetPath) {
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            System.err.println("File nguồn không tồn tại!");
            return;
        }

        if (targetFile.exists()) {
            System.err.println("File đích đã tồn tại! Sao chép sẽ ghi đè dữ liệu.");
        }

        int charCount = 0;

        try {
            FileReader reader = new FileReader(sourceFile);
            FileWriter writer = new FileWriter(targetFile);

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
                charCount++;
            }

            reader.close();
            writer.close();

            System.out.println("✅ Sao chép thành công!");
            System.out.println("📌 Số ký tự đã sao chép: " + charCount);

        } catch (IOException e) {
            System.err.println("❌ Lỗi trong quá trình sao chép file!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn file nguồn: ");
        String source = scanner.nextLine();

        System.out.print("Nhập đường dẫn file đích: ");
        String target = scanner.nextLine();

        copyFile(source, target);
    }
}

