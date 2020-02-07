package NamePrint;


public class information {
	public static void noteofbook01() {
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("Please enter the author name one by one. (1->print the reference list and in-text citation 2->nextstep)\n"
				+ "if it is the editor name, then please press 3 and start entering\n"
				+ "if you have finished entering the editor name please press 2 to nextstep");
	}
	public static void editor() {
		System.out.println("Please enter the editor name one by one. (1->print the reference list 2->nextstep)");
	}
	public static void noteofbookname() {
		System.out.println("Please enter the Name of the book:");
		System.out.println("should be italic, sentence case.");
		System.out.println("The situation need to be capitalized in sentence case:");
		System.out.println("1. Author or person\n" + "2. Company, institution, or agency");
		System.out.println("3. Product\n" + "4. Website or database");
		System.out.println("5. Periodical (journal, magazine, newspaper)");
		System.out.println("6. Software, program, or app\n" + "7. the first word after a colon when what follows the colon is an independent clause");
		System.out.println("8. Country name include the adj e.g. Australian");
	}
	
	public static void noteofyear() {
		System.out.println("Please enter the Year:" + " e.g. 2016 without the bracket");	
	}
	
	public static void noteofedition() {
		System.out.println("Please enter the edition(purely number, if 1 then enter 1):");
	}
	
	public static void cityOfPublisher() {
		System.out.println("Please enter the City of publisher(e.g. Milton Park)");
	}
	
	public static void abbreviation() {
		System.out.println("Please enter the abbreviation of the City of publisher, if the country is out of America\n"
				+ "then enter the fullname of the country e.g. UK is England");
	}
	
	public static void publisherName() {
		System.out.println("Please enter the Publisher name e.g. Rutgers University Press "
				+ "if don't have then enter 1");
	}
	public static void doi01() {
		System.out.println("press 1 to enter the doi; press 2 to enter the URL");
	}
	public static void doi02() {
		System.out.println("Please enter the doi");
	}
	public static void doi03() {
		System.out.println("Please enter the URL");
	}
	public static void magazine() {
		System.out.println("Please enter the author of the magazine one by one. (1->print the reference list and in-text citation 2->nextstep)");
	}
}
