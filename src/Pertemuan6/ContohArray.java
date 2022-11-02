package Pertemuan6;

public class ContohArray {
    public static void main(String[] args) {
        // deklarasi array langsung
        String[] monthName = {"Januari", "Februari", "Maret", 
                            "April", "Mei", "Juni", "Juli", 
                            "Agustus", "September", "Oktober", 
                            "November", "Desember"};
        
        // deklarasi array
        int[] monthhDay = new int[12];
        for(int i = 1; i <= monthhDay.length; i++){
            if(i <= 7){
                if(i == 2){
                    monthhDay[i-1] = 28;
                }
                else if(i % 2 == 1){
                    monthhDay[i-1] = 31;
                }
                else{
                    monthhDay[i-1] = 30;
                }
            }
            else{
                if(i % 2 == 1){
                    monthhDay[i-1] = 30;
                }
                else{
                    monthhDay[i-1] = 31;
                }
            }
        }

        // akses elemen
        System.out.println("Bulan "+monthName[9]+" tahun 2022 berjumlah "+monthhDay[9]+" hari");
        
        // akses elemen dengan loop
        System.out.println("");
        for(int i = 0; i < monthName.length; i++){
            System.out.println("Bulan "+monthName[i]+" tahun 2022 berjumlah "+monthhDay[i]+" hari");
        
        }

        // for each loop
        System.out.println("\nNama bulan dalam satu tahun: ");
        for(String month : monthName){
            System.out.println(month);
        }
    }
}
