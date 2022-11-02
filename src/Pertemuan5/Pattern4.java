package Pertemuan5;

public class Pattern4 {
    public static void main(String[] args) {
		String stringPattern1 = "[wb](ad|eed)";
		String string1 = "bad";
		String string2 = "weed";
		String string3 = "was";
		
		System.out.println(string1+" matches "+stringPattern1+" : "+string1.matches(stringPattern1));
		System.out.println(string2+" matches "+stringPattern1+" : "+string2.matches(stringPattern1));
		System.out.println(string3+" matches "+stringPattern1+" : "+string3.matches(stringPattern1));
		
		String stringPattern2 = "[km](an|as)[0-9]";
		String string4 = "kan1";
		String string5 = "mas2";
		String string6 = "mas";
		
		System.out.println(string4+" matches "+stringPattern2+" : "+string4.matches(stringPattern2));
		System.out.println(string5+" matches "+stringPattern2+" : "+string5.matches(stringPattern2));
		System.out.println(string6+" matches "+stringPattern2+" : "+string6.matches(stringPattern2));
	}
}
