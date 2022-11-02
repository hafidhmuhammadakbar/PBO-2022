package Pertemuan9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		// set up file and stream
		File outFile = new File("D:\\JavaProgramming\\PBO\\Pertemuan9\\data1.txt");
		FileOutputStream outStream = new FileOutputStream(outFile);
		
		// data to output
		byte[] byteArray = { 10, 20, 30, 40, 50, 60, 70, 80 };
		
		// write data to the stream
		outStream.write(byteArray);
		
		// output done, so close the stream
		outStream.close();
        System.out.println("DONE");
	}
}