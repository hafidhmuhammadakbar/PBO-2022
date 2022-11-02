package Pertemuan3;

public class Latihan1a {

    public static void main(String[] args) {
        //soal 1a
        int sum1 = 0;
        for(int i = 1; i<=100; i++){
            sum1 += i;
        }
        System.out.println("Hasil : "+sum1);

        //soal 1b
        int sum2 = 0;
        for(int i = 2; i<=500; i+=2){
            sum2 += i;
        }
        System.out.println("Hasil : "+sum2);

        //soal 1c
        long product1 = 1L;
        for(long i = 5; i <= 50; i+=5){
            product1 *= i;
        }
        System.out.println("Hasil : "+product1);
    }
}
