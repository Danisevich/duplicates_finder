package ru.danisevich;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class ValidatorTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void whenValidParameters() {
        String[] args = new String[]{"-f=c:/"};
        Validator validator = new Validator();
        validator.valid(args);
        String string = validator.get("-f");
        assertEquals(string, "c:/");
    }

    @Test (expected = IllegalArgumentException.class)
    public void whenInvalidNumberParameters() {
        String[] args = new String[0];
        new Validator().valid(args);
    }

    @Test (expected = IllegalArgumentException.class)
    public void whenInvalidDirectory() throws IOException {
        folder.newFolder("folder");
        String[] args = new String[]{"-f=notFolder"};
        new Validator().valid(args);
    }

    @Test (expected = IllegalArgumentException.class)
    public void whenInvalidInput() {
        String[] args = new String[]{"-f="};
        new Validator().valid(args);
    }

    @Test
    public void whenValidDirectoryInTempFolder() throws IOException {
        File tempFolder = folder.newFolder("folder");
        String[] args = new String[]{"-f=" + tempFolder.getAbsolutePath()};
        Validator validator = new Validator();
        validator.valid(args);
        assertEquals(validator.get("-f"), tempFolder.getAbsolutePath());
    }
}