package com.test.utf.example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Convert_InputStream_IntoString {

	
	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream("file.txt");

			InputStreamReader isRead = new InputStreamReader(fileInputStream);

			BufferedReader reader = new BufferedReader(isRead);

			StringBuffer s = new StringBuffer();
			String str;

			while ((str = reader.readLine()) != null) {
				s.append(str);
			}
			
			System.out.println("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
