package Pertemuan5;

public class Matching {
    public static void main(String[] args) {
        String s1 = "UNS";
        String s2 = "UNS";
        String s3 = "UNY";
        System.out.println(s1.matches(s2));
        System.out.println(s1.equals(s3));

        String pattern1 = "[A-Za-z]{2,4}";
        String str1 = "AZS";
        String str2 = "AZSC";
        String str3 = "ASjaa";
        System.out.println(str1.matches(pattern1));
        System.out.println(str2.matches(pattern1));
        System.out.println(str3.matches(pattern1));
    }
}
