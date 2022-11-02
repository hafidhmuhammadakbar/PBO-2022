package Pertemuan5;

public class Pattern6 {
    public static void main(String[] args) {
        String stringPattern1 = "[a-zA-Z0-9]{3}";
        String stringPattern2 = "[\\w]{3}";
        String string1 = "1ab";
        String string2 = "a11";
        String string3 = "C96";
        String string4 = "abcd";
        
        System.out.println(string1+" matches "+stringPattern1+" : "+string1.matches(stringPattern1));
        System.out.println(string2+" matches "+stringPattern1+" : "+string2.matches(stringPattern1));
        System.out.println(string3+" matches "+stringPattern1+" : "+string3.matches(stringPattern1));
        System.out.println(string4+" matches "+stringPattern1+" : "+string4.matches(stringPattern1));
        System.out.println(string1+" matches "+stringPattern2+" : "+string1.matches(stringPattern2));
        System.out.println(string2+" matches "+stringPattern2+" : "+string2.matches(stringPattern2));
        System.out.println(string3+" matches "+stringPattern2+" : "+string3.matches(stringPattern2));
        System.out.println(string4+" matches "+stringPattern2+" : "+string4.matches(stringPattern2));
    }
}