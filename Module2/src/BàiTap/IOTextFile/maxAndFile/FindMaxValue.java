package BàiTap.IOTextFile.maxAndFile;

import java.util.List;

public class FindMaxValue {

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

        List<Integer> numbers = readAndWriteFile.readFile("numbers.txt");

        if (numbers.isEmpty()) {
            System.out.println("Không có dữ liệu để xử lý!");
            return;
        }

        int maxValue = findMax(numbers);

        readAndWriteFile.writeCSV("result.csv", maxValue);

        System.out.println("Đã ghi giá trị lớn nhất vào result.csv");
    }
}
