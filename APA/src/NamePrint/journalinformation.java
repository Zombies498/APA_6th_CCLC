package NamePrint;

public class journalinformation {
	public static void journal() {
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("Please enter the author name one by one. (1->print the reference list and in-text citation 2->nextstep)\n");
	}
	public static void noteofyear() {
		System.out.println("Please enter the year: e.g. 2016 without the bracket");
	}
	public static void nameofarticle() {
		System.out.println("Please enter the name of article\n"
				+ "it should be sentence case plus nonitalic");
		System.out.println("The situation need to be capitalized in sentence case:");
		System.out.println("1. Author or person\n" + "2. Company, institution, or agency");
		System.out.println("3. Product\n" + "4. Website or database");
		System.out.println("5. Periodical (journal, magazine, newspaper)");
		System.out.println("6. Software, program, or app\n" + "7. the first word after a colon when what follows the colon is an independent clause");
		System.out.println("8. Country name include the adj e.g. Australian");
	}
	public static void nameofjournal() {
		System.out.println("Please enter the name of the journal\n"
				+ "it should be title case plus italic");
	}
	public static void volumenumber() {
		System.out.println("Please enter the volumne number");
	}
	public static void issuenumber() {
		System.out.println("Please enter the issue number, if dont' have then just press 1");
	}
	public static void page(){
		System.out.println("Please enter the page range, e.g. 38-45 or E1-E8, don't forget the - between them!!\n"
				+ "if you don't have found the page range then press 1, if it's just separate page, then press 2 to start entering");
	}
	
}
