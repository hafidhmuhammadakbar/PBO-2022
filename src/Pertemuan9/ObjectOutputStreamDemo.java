package Pertemuan9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		// set up the streams
		File outFile = new File("D:\\JavaProgramming\\PBO\\Pertemuan9\\data4.txt");
		FileOutputStream outFileStream = new FileOutputStream(outFile);
		ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream);

		// write serializable Person objects one at a time
		Mahasiswa mhs;
		for (int i = 0; i < 10; i++) {
			mhs = new Mahasiswa("M050100"+i, "Bakri "+i, 'L', "Solo");
			outObjectStream.writeObject(mhs);
		}

		// output done, so close the stream
		outObjectStream.close();
	}
}