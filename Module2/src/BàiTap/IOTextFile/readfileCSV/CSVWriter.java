package BàiTap.IOTextFile.readfileCSV;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {

    public void createAndWriteCSV(String filePath) {

        File file = new File(filePath);

        if (file.exists()) {
            System.out.println("File đã tồn tại, không cần tạo mới.");
            return;
        }

        try {
            FileWriter writer = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(writer);

            bw.write("1,\"AU\",\"Australia\"");
            bw.newLine();
            bw.write("2,\"CN\",\"China\"");
            bw.newLine();
            bw.write("3,\"AU\",\"Australia\"");
            bw.newLine();
            bw.write("4,\"CN\",\"China\"");
            bw.newLine();
            bw.write("5,\"JP\",\"Japan\"");
            bw.newLine();
            bw.write("6,\"CN\",\"China\"");
            bw.newLine();
            bw.write("7,\"JP\",\"Japan\"");
            bw.newLine();
            bw.write("8,\"TH\",\"Thailand\"");

            bw.close();

            System.out.println("Đã tạo file và ghi dữ liệu CSV thành công!");

        } catch (IOException e) {
            System.out.println("Lỗi khi tạo file CSV!");
            e.printStackTrace();
        }
    }
}

