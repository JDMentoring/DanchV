package ua.smartprog.lessons.lesson_52;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ParseTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> words = new HashSet<String>();
        String loadedFile = load("./src/main/java/ua/smartprog/lessons/lesson_52/somebook.txt");
        String[] array = (loadedFile + " ").split("\\p{P}?[ \\t\\n\\r]+");
    }

    public static String load(String path) throws FileNotFoundException {
        StringBuilder word = new StringBuilder();
        File file = new File(path);

        try {
            BufferedReader inputData = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                String temp;
                while ((temp = inputData.readLine()) != null) {
                    word.append(temp);
                    word.append("\n");
                }
            } finally {
                inputData.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return word.toString();
    }
}
