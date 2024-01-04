package Scanner;

import codeMu.Helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = null;

        Set<String> set = new TreeSet<>();
        try {
            scanner = new Scanner(new FileReader(new File("C:\\javaLessons\\text.txt")));
            scanner.useDelimiter("\\W");
            while (scanner.hasNext()) {
                String word = scanner.next();
                set.add(word);
            }
            for(String word:set) {
                Helper.show(word);
            }
        }catch (FileNotFoundException e) {
            Helper.show("Have a problem");
        } finally {
            scanner.close();
        }
    }
}
