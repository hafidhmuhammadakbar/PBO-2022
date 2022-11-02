package Praktikum3;

public class JumlahBilGanjilWhile {
    
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while(i <= 25) {
            if((i%2) == 1) {
                sum += i;
            }
            i++;
        }
        System.out.println("Jumlah bilangan ganjil antara 0 dan 25 adalah "+sum);
    }
}
