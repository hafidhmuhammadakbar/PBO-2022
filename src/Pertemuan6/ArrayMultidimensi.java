package Pertemuan6;

public class ArrayMultidimensi {
    public static void main(String[] args) {
        char[][] arr = new char[5][5];
        int ctr=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (char) (ctr+97);
                ctr++;
            }
        }

        System.out.println("\t\t0 1 2 3 4");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Baris ke-" + i + ":\t");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // deklarasi dan instantiate array 3d (sekaligus)
        int intArray[][][] = new int[5][5][3];
        
        intArray[0][3][1] = 1;
        System.out.println(intArray[0][3][1]);
    }

}