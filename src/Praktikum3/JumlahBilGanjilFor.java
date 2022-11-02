package Praktikum3;

public class JumlahBilGanjilFor {
    
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i <= 25; i++){
            if((i%2) == 1){
                sum += i;
            }
        }
        System.out.println("Jumlah bilangan ganjil antara 0 dan 25 adalah "+sum);
    }
}
