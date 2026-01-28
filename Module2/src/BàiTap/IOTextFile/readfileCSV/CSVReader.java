package BàiTap.IOTextFile.readfileCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public List<Country> readCSV(String filePath) {
        List<Country> countries = new ArrayList<>();

        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");

                int id = Integer.parseInt(fields[0]);
                String code = fields[1].replace("\"", "");
                String name = fields[2].replace("\"", "");

                Country country = new Country(id, code, name);
                countries.add(country);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Lỗi đọc file CSV!");
            e.printStackTrace();
        }

        return countries;
    }
}

