package NamePrint;

public class magazineinformation {
	
	public static void magazine() {
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("Please enter the author name one by one. (1->print the reference list and in-text citation 2->nextstep)\n");
	}
	
	public static void yaer() {
		System.out.println("Please enter the year: e.g. 2016 just purely number");
	}
	public static void month() {
		System.out.println("Please enter the month e.g. February");
	}
	public static void day() {
		System.out.println("Please enter the day e.g. 23 just purely number, if don't have then press 1\n");
	}
	public static void article_title() {
		System.out.println("Please enter the article title (should be sentence case)");
	}
	public static void magazine_title() {
		System.out.println("Please enter the magazine tile (should be title case)");
	}
	public static void volume() {
		System.out.println("Please enter the volume number, if don't have then press 1");
	}
	public static void issue() {
		System.out.println("Please enter the issue number, if don't have then press 1");
	}
	public static void page_num01() {
		System.out.println("Please enter the page range e.g. 38-45 just number plus the -, if don't have then press 1\n"
				+ "if it's just separate page, then press 2 to start entering");
	}
	public static void page_num02() {
		System.out.println("Please enter the page number one by one, if finish entering then press 2");
	}
	public static void URL() {
		System.out.println("Please enter the URL");
	}
}
