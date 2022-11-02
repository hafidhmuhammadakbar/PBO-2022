package Praktikum5;

import java.util.Scanner;

public class HackerrankNo1 {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        String inputString;

        inputString = scan.nextLine();
        scan.close();
        
        for(int i = 0 ; i < inputString.length() ; i += 3){
            System.out.print(inputString.charAt(i));
        }
    }
}