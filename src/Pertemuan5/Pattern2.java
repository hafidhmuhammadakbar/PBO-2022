package Pertemuan5;

public class Pattern2 {
    public static void main(String[] args) {
		String stringPattern1 = "[a-zA-Z0-9]";
		String string1 = "1";
		String string2 = "a";
		String string3 = "C";
		String string4 = "+"; // false karena pattern 1 tidak memuat karakter
		
		System.out.println(string1+" matches "+stringPattern1+" : "+string1.matches(stringPattern1));
		System.out.println(string2+" matches "+stringPattern1+" : "+string2.matches(stringPattern1));
		System.out.println(string3+" matches "+stringPattern1+" : "+string3.matches(stringPattern1));
		System.out.println(string4+" matches "+stringPattern1+" : "+string4.matches(stringPattern1));
		
		String stringPattern2 = "K[a-zA-Z0-9][a-z]*"; // tanda * maksudnya bisa diulang (kode yg ke-3)
		String string5 = "Kcza";
		String string6 = "KCz0";
		String string7 = "KCkzireyw";
		
		System.out.println(string5+" matches "+stringPattern2+" : "+string5.matches(stringPattern2));
		System.out.println(string6+" matches "+stringPattern2+" : "+string6.matches(stringPattern2));
		System.out.println(string7+" matches "+stringPattern2+" : "+string7.matches(stringPattern2));
	}
}
