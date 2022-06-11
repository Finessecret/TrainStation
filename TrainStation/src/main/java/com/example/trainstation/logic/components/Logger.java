package com.example.trainstation.logic.components;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
    public static final String FILENAME = ".\\logs.txt";

    public void logSimplified(String message) {
        try (FileWriter fileWriter = new FileWriter(FILENAME, true)) {
            fileWriter.write(message);
            fileWriter.write("\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void log(String message) {
        try (FileWriter fileWriter = new FileWriter(FILENAME, true)) {
            fileWriter.write(new Date().toString());
            fileWriter.write(": ");
            fileWriter.write(message);
            fileWriter.write("\n\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reset() {
        try (FileWriter fileWriter = new FileWriter(FILENAME, false)) {
            fileWriter.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
