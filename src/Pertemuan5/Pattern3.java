package Pertemuan5;

public class Pattern3 {
    public static void main(String[] args) {
		String stringPattern1 = "[a-zA-Z0-9]{3}"; //mengulang regex sebanyak 3 kali
		String string1 = "1ab";
		String string2 = "a11";
		String string3 = "C96";
		String string4 = "abcd";
		
		System.out.println(string1+" matches "+stringPattern1+" : "+string1.matches(stringPattern1));
		System.out.println(string2+" matches "+stringPattern1+" : "+string2.matches(stringPattern1));
		System.out.println(string3+" matches "+stringPattern1+" : "+string3.matches(stringPattern1));
		System.out.println(string4+" matches "+stringPattern1+" : "+string4.matches(stringPattern1));
		
		String stringPattern2 = "[a-zA-Z0-9]{3,6}"; //mengulang regex paling tidak 3 kali, tp tidak sampai 6 kali
		String string5 = "abcd08439";
		String string6 = "a1b2c3";
		String string7 = "A7b6";
		String string8 = "abc";
		
		System.out.println(string5+" matches "+stringPattern2+" : "+string5.matches(stringPattern2));
		System.out.println(string6+" matches "+stringPattern2+" : "+string6.matches(stringPattern2));
		System.out.println(string7+" matches "+stringPattern2+" : "+string7.matches(stringPattern2));
		System.out.println(string8+" matches "+stringPattern2+" : "+string8.matches(stringPattern2));
	}
}
