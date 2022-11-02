package Praktikum3;

public class JumlahBilGanjilDoWhile {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        do {
            if((i%2) == 1) {
                sum += i;
            }
            i++;
        } while(i <= 25);
    System.out.println("Jumlah bilangan ganjil antara 0 dan 25 adalah "+sum);
    }
}
