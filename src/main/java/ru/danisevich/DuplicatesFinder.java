package ru.danisevich;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DuplicatesFinder {
    public static void main(String[] args) throws IOException {
        Validator validator = new Validator();
        validator.valid(args);
        Files.walkFileTree(Path.of(validator.get("-f")), new DuplicatesVisitor());
    }
}