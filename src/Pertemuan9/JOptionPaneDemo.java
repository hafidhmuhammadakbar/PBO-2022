package Pertemuan9;

import javax.swing.JOptionPane;

public class JOptionPaneDemo {
	public static void main(String[] args) {
		String m = JOptionPane.showInputDialog("Ketik nama anda: ");
		JOptionPane.showMessageDialog(null, "selamat datang, "+m);
	}
}
