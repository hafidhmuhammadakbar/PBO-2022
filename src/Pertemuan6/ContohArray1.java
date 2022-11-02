package Pertemuan6;

public class ContohArray1 {
    // public static void main(String[] aStrings) {
    //     int[] number = new int[5];

    //     for (int i = 2; i < number.length; i++) {
    //         number[i] = i;
    //     }
    //     for (int i = 0; i < number.length; i++) {
    //         System.out.println(number[i]);
    //     }
        
    // }
    public static void main(String args[]){  
        //declaring and initializing 2D array  
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
        //printing 2D array  
        for(int i=0;i<3;i++){  
            for(int j=0;j<3;j++){  
                System.out.print(arr[i][j]+" ");  
            }  
            System.out.println();  
        }  
    }
}
