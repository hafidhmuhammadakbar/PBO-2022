package Pertemuan5;

public class DemoString {
    public static void main(String[] args) {
        String name = "Sumatra";

        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.replace("a", "u"));
        System.out.println(name+" Selatan beribukota di Palembang");

        int size = name.length( );
        for (int i = 0; i < size; i++) {
            System.out.println(name.charAt(i));
        }
    }
}
