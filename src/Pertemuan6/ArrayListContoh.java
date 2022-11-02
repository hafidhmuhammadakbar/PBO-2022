package Pertemuan6;

import java.util.ArrayList;

public class ArrayListContoh {
    public static void main(String[] args) {
        ArrayList<Integer> numberArr = new ArrayList<Integer>();

        // menambah elemen di akhir array
        numberArr.add(10);
        numberArr.add(10);
        numberArr.add(20);
        numberArr.add(30);
        System.out.println(numberArr.toString());
        
        // menambah elemen di index 1
        numberArr.add(1, 99);
        System.out.println(numberArr.toString());

        // menghapus elemen di akhir index
        numberArr.remove(numberArr.size() - 1);
        System.out.println(numberArr.toString());

        // menghapus elemen objek Integer 10
        numberArr.remove((Integer)10);
        System.out.println(numberArr.toString());
    }    
}