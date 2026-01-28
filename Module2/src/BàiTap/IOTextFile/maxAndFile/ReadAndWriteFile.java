package BàiTap.IOTextFile.maxAndFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();

        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                for (String num : parts) {
                    numbers.add(Integer.parseInt(num));
                }
            }

            br.close();

        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
        }

        return numbers;
    }

    public void writeCSV(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("max_value");
            bufferedWriter.newLine();

            bufferedWriter.write(String.valueOf(max));

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
