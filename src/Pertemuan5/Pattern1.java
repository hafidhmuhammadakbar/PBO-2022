package Pertemuan5;

public class Pattern1 {
    public static void main(String[] args) {

		String stringPattern = "5[123]8"; // Regex
		String string1 = "138";
		String string2 = "518";
		String string3 = "527";
		String string4 = "528";
		
		System.out.println(string1.matches(stringPattern));
		System.out.println(string2.matches(stringPattern));
		System.out.println(string3.matches(stringPattern));
		System.out.println(string4.matches(stringPattern));
	}
}
