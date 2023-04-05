import java.io.*;
public class FisDemo {
public static void main(String[] args)  throws FileNotFoundException , IOException {
	FileInputStream fis = new FileInputStream("abc.rtf");
	int data;
	while((data=fis.read())!=-1) {
	System.out.println("Data :"+ (char)data);
	}
  fis.close();
	}
}
