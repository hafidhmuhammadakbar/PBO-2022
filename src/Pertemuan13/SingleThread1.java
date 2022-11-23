import java.text.SimpleDateFormat;
import java.util.Date;

public class SingleThread1 {
	public static void main(String[] args) {
		// ambil nama main thread
		String namaThread = Thread.currentThread().getName();
		System.out.println("Nama thread utama : " + namaThread);

		// format tanggal dan waktu, sampai detik
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		// print 10x dari indeks 0 hingga 9
		for (int i = 0; i < 10; i++) {
			try {
				// pause main thread
				// memberi jeda waktu 1000 ms
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			// print 
			// main thread melakukan print 10x + info waktu
			System.out.println(
					"thread " + namaThread + ", melakukan print " + i 
					+ ", pada " + formatter.format(new Date()));
		}
	}
}