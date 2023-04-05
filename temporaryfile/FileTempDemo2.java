package com.test.temporaryfile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTempDemo2 {
  public static void main(String[] args) {
    try {
      File tempFile = File.createTempFile("temp", ".txt");
      FileOutputStream out = new FileOutputStream(tempFile);
      out.write("Hello, World!".getBytes());
      out.close();
      System.out.println("Data written to temporary file: " + tempFile.getAbsolutePath());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
