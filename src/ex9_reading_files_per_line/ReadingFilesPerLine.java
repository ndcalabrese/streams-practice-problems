package ex9_reading_files_per_line;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        for ( String line : read("src/ex9_reading_files_per_line/sample.txt")) {
            System.out.println(line);
        }
    }

    public static List<String> read(String fileName) {
        List<String> rows =  new ArrayList<>();
//
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
                    stream.forEach(rows::add);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return rows;
    }

}
