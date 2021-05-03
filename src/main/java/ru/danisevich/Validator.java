package ru.danisevich;

import java.io.File;

public class Validator {
    public static void valid(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Root folder is null. Usage java -jar duplicates_finder.jar -f=ROOT_FOLDER.");
        }
        String path = args[0].split("=")[1];
        if (!new File(path).isDirectory()) {
            throw new IllegalArgumentException(path + " is not a directory.");
        }
    }
}
