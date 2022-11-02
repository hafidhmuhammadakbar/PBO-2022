package Praktikum5;

import java.util.Scanner;

public class HackerrankNo2 {
    public static void main(String args[] ) throws Exception {
        String inputString;
        int tipe;
        Scanner scan = new Scanner(System.in);

        inputString = scan.nextLine();
        scan.close();

        if(inputString.matches("^[AIUEOaiueo].*")){
            tipe = 1;
        }
        else if(inputString.matches("^(.*[^ng])(ng)")){
            tipe = 2;
        }
        else{
            tipe = -1;
        }
        System.out.print(tipe);
    }
}
