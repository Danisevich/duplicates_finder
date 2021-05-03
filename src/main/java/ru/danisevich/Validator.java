package ru.danisevich;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Validator {
    private final Map<String, String> values = new HashMap<>();

    public String get(String key) {
        return values.get(key);
    }

    private void parse(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Root folder is null. Usage java -jar duplicates_finder.jar -f=ROOT_FOLDER.");
        }
        Arrays.stream(args)
                .map(s -> s.split("="))
                .filter(strings -> {
                    if (strings.length != 2) {
                        throw new IllegalArgumentException("Invalid input.");
                    }
                    return true;
                })
                .forEach(strings -> values.put(strings[0], strings[1]));
    }

    public void valid(String[] args) {
        parse(args);
        String path = values.get("-f");
        if (!new File(path).isDirectory()) {
            throw new IllegalArgumentException(path + " is not a directory.");
        }
    }
}
