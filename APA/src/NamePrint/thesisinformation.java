package NamePrint;

public class thesisinformation {
	public static void begin() {
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("Please enter the author name one by one. (1->print the reference list and in-text citation 2->nextstep)\n");
	}
	public static void noteofthesis() {
		System.out.println("Please choose which kind of source you wanna cite\n"
				+ "1->master's thesis 2->doctoral dissertation");
	}
	
	public static void noteofyear() {
		System.out.println("Please enter the Year:" + " e.g. 2016 without the bracket");	
	}
	public static void nameofthethesis() {
		System.out.println("Please enter the Name of the thesis or dissertation in sentence case:");
	}
	public static void levelofthethesis() {
		System.out.println("If the thesis is unpublished thesis then press 1, if not then press 2");
	}
	public static void levelofthediss() {
		System.out.println("If the thesis is unpublished dissertation then press 1, if not then press 2");
	}
	public static void nameoftheuniversity() {
		System.out.println("Please enter the name of the university in title case");
	}
	public static void cityoftheuniversity() {
		System.out.println("Please enter the city of the university");
	}
	public static void countryoftheuniversity() {
		System.out.println("for U.S. thesis please enter the state abbreviation of the university\n"
				+ "for non-US thesis please enter the Country of the University e.g. Australia");
	}
	public static void URL01() {
		System.out.println("if this thesis has URL(which means web thesis), then enter 1, if not then enter 2");
	}
	public static void URL02() {
		System.out.println("Please enter the URL");
	}
}
