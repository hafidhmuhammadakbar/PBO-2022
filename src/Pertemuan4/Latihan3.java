package Pertemuan4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try {
            int num = scan.nextInt();
            scan.close();
            if(num > 100){
                throw new Exception("Out of bond");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Entry");
        } catch (Exception e) {
            System.out.println(e);
        }
        //scan.close();
    }
}
