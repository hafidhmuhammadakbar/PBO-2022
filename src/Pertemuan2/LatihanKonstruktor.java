package Pertemuan2;

public class LatihanKonstruktor {
    int num1, num2;
    
    public LatihanKonstruktor(int x, int y){
        this.num1 = x;
        this.num2 = y;
    }
    public static void main(String[] args){
        LatihanKonstruktor latihanKonstruktor = new LatihanKonstruktor(12, 13);
        System.out.println(latihanKonstruktor.num1);
        System.out.println(latihanKonstruktor.num2);
    }
}
