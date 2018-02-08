package com.balaji;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by balaji on 8/2/18.
 */
public class FileProcessorTest {

    @Test
    public void readAFile() throws IOException {
        FileReader fileReader = new FileReader("src/test/resources/sample.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        readLine(bufferedReader, "\"Name\"", "\"Age\"");
        readLine(bufferedReader, "\"Balaji\"", "\"39\"");

        fileReader.close();
    }

    private void readLine(BufferedReader bufferedReader, String column1Value, String column2Value) throws IOException {
        String line = bufferedReader.readLine();
        String[] lineColumns = line.split(",");
        assertEquals(column1Value, lineColumns[0].trim());
        assertEquals(column2Value, lineColumns[1].trim());
    }
}
