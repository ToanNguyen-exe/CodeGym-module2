package BàiTap.IOTextFile.readfileCSV;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String filePath = "countries.csv";

        CSVWriter writer = new CSVWriter();
        writer.createAndWriteCSV(filePath);

        CSVReader reader = new CSVReader();
        List<Country> countries = reader.readCSV(filePath);

        System.out.println("Danh sách quốc gia:");
        for (Country c : countries) {
            System.out.println(c);
        }
    }
}


