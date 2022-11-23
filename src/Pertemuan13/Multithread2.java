import java.text.SimpleDateFormat;
import java.util.Date;

public class Multithread2 implements Runnable {
	public void run() {
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

	public static void main(String[] args) {
		// membuat 2 object class Multithread
		Multithread mt1 = new Multithread();
		Multithread mt2 = new Multithread();

		// menjalankan 2 thread program
		mt1.start();
		mt2.start();
	}
}