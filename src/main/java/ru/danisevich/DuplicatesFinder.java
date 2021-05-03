package ru.danisevich;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DuplicatesFinder {
    public static void main(String[] args) throws IOException {
        Validator.valid(args);
        Files.walkFileTree(Path.of(args[0].split("=")[1]), new DuplicatesVisitor());
    }
}