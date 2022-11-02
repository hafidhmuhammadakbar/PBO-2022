package Pertemuan3;

import java.util.Scanner;

public class PerulanganWhile {
    public static void main(String[] args) {
        // membuat variabel dan scanner
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);

        while( running ) {
            System.out.println("\nApakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]> ");
            jawab = scan.nextLine();
            
            // cek jawabnnya, kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("ya") ){
                running = false;
            }
            counter++;
        }

    System.out.println("\nAnda sudah melakukan perulangan sebanyak " +counter + " kali");
    scan.close();
    }
}