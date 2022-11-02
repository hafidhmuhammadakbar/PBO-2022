package Pertemuan5;

public class test {
    public static void main(String[] args) {
        int i = 5, j = 0;
        int x = 5, y = 0;
        while (i < 5) {
            j += i;
            i++;
        }
        System.out.println(j);
        do {
            y += x;
            x++;
        } while (x < 5);
        System.out.println(y);
    }
}
