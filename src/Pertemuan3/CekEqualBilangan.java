package Pertemuan3;

public class CekEqualBilangan {
    public static void main(String[] args) {
        Integer num1 = 100;
        Integer num2 = 200;

        System.out.println(num1.equals(num2));

        String str1 = "Java";
        //String str2 = "Oper";
        String str3 = "Java";
        String str4 = new String("Java");
        String str5 = new String("Java");
        if(str4 == str5){
            System.out.println("SAMA");
        }
        else{
            System.out.println("GA SAMA");
        }
        boolean result1 = str1 == str3;
        System.out.println(str1.equals(str3));
        System.out.println(str4.equals(str5));
        System.out.println(result1);
    }
}
