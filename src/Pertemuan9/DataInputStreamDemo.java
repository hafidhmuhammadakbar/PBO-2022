package Pertemuan9;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamDemo {
	public static void main(String[] args) throws IOException {
		// set up file and stream
		File inFile = new File("D:\\JavaProgramming\\PBO\\Pertemuan9\\data2.txt");
		FileInputStream inFileStream = new FileInputStream(inFile);
		DataInputStream inDataStream = new DataInputStream(inFileStream);
		
		//read values back from the stream and display them
		System.out.println(inDataStream.readInt());
		System.out.println(inDataStream.readLong());
		System.out.println(inDataStream.readFloat());
		System.out.println(inDataStream.readDouble());
		System.out.println(inDataStream.readChar());
		System.out.println(inDataStream.readBoolean());
		
		//input done, so close the stream
		inDataStream.close();
	}
}