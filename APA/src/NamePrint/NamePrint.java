package NamePrint;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;


public class NamePrint {
	public static void main(String[] args) throws java.io.IOException {
		List<String> names = new ArrayList<String>();
		List<String> appended = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		int[] first_next_split = new int[10];
		int[] type_split = new int[10];
		int[] editor_split = new int[10];
		int endofsourcename_sign1 = 0;
		int endofsourcename_sign2 = 0;
		first_next_split = DataProcess.resetArray01(first_next_split);//set 1
		type_split = DataProcess.resetArray02(type_split);//set 0
		editor_split = DataProcess.resetArray02(editor_split);//set 0
		while (true) {
			informationtotal.noteofbegin();
			String scString = scanner.nextLine();
			switch(scString) {
		case "1":
				while (type_split[0] == 0) {
					information.noteofbook01();
					String sc = scanner.nextLine();
					switch (sc) {
					case "1":
						appended.add(0, getName(names, editor_split[0]));
						print(appended);
						System.out.println("below is the corresponding intext citation");
						System.out.println("First in-text citation:" + getIntextName04(names, first_next_split[0]) + getIntext02(appended));
						first_next_split[0] = 2;
						System.out.println("Subsequent citations:" + getIntextName04(names, first_next_split[0]) + getIntext02(appended));
						appended.clear();
						names.clear();
						first_next_split = DataProcess.resetArray01(first_next_split);
						editor_split = DataProcess.resetArray02(editor_split);
						type_split = DataProcess.resetArrayElement(type_split, 0);//set 1
						break;
						case "2":
								information.noteofyear();
								String yearStr = "";
								yearStr = scanner.nextLine();
								String yearString = " (" + yearStr + ").";
								appended.add(yearString);
								
								information.noteofbookname();
								String bookname = "";
								bookname = " " + scanner.nextLine() + "(i)";
								appended.add(bookname);
								
								information.noteofedition();
								int edition = Integer.parseInt(scanner.nextLine());
								appended.add(NamePrint.editionCreator(edition));
								
								information.cityOfPublisher();
								String publisher = " " + scanner.nextLine() + ",";
								appended.add(publisher);
								
								information.abbreviation();
								String abbreviation = " " + scanner.nextLine() + ":";
								appended.add(abbreviation);
			
								information.publisherName();
								String publisherNameString1 = scanner.nextLine();
								String publisherNameString = " " + publisherNameString1 + ".";
								appended.add(publisherNameString);
								break;//这个break不加的话, 执行玩case 2之后, 继续执行default, 会把2加进names
						case "3":
							String string = "";
							while(true) {
								information.editor();
								string = scanner.nextLine();
								if(string.equals("2")) {
									editor_split[0] = 1;
									break;
								}else {
									names.add(string);
								}
							} break;
					default:
						names.add(sc);
						break;
					} if (type_split[0] == 1) {
						break;
					} 
				}
				type_split[0] = 0;//set 0
				break;
		case "8":
			while (type_split[1] == 0) {
				journalinformation.journal();
				String scString2 = scanner.nextLine();
				switch(scString2) {
				case "1":
					appended.add(0, getName(names, editor_split[1]));
					print(appended);
					System.out.println("below is the corresponding interest citation");
					System.out.println("First in-text citation:" + getIntextName04(names, first_next_split[1]) +getIntext02(appended));
					first_next_split[1] = 2;
					System.out.println("Subsequent citations:" + getIntextName04(names, first_next_split[1]) + getIntext02(appended));
					appended.clear();
					names.clear();
					first_next_split = DataProcess.resetArray01(first_next_split);//set 1
					editor_split = DataProcess.resetArray02(editor_split);//set 0
					type_split = DataProcess.resetArrayElement(type_split, 1);//set 1 for the second position
					break;
				case "2":
					journalinformation.noteofyear();
					String yearString = " (" + scanner.nextLine() + ").";
					appended.add(yearString);
					
					journalinformation.nameofarticle();
					String article = " " + scanner.nextLine() + ".";
					appended.add(article);
					
					journalinformation.nameofjournal();
					String journal = " " + scanner.nextLine() + "(i),";
					appended.add(journal);
					
					journalinformation.volumenumber();
					String volume = " " + scanner.nextLine() + "(i)";
					appended.add(volume);
					
					journalinformation.issuenumber();
					String issue = "(" + scanner.nextLine() + "),";
					if (issue.equals("(" + "1" + "),")) {
						appended.add(",");
					}else {
						appended.add(issue);
					}

					journalinformation.page();
					String page = " " + scanner.nextLine() + ".";
					appended.add(page);
					break;
				default:
					names.add(scString2);
					break;
				} if (type_split[1] == 1) {
					break;
				}
			} 
			type_split[1] = 0;//set 0
			break;
		case "2":
			while(type_split[2] == 0) {
				information.noteofbook01();
				String scString2 = scanner.nextLine();
				switch(scString2) {
				case "1":
					appended.add(0, getName(names, editor_split[2]));
					print(appended);
					System.out.println("below is the corresponding intext citation");
					System.out.println("First in-text citation:" + getIntextName04(names, first_next_split[2]) + getIntext02(appended));
					first_next_split[2] = 2;
					System.out.println("Subsequent citations:" + getIntextName04(names, first_next_split[2]) + getIntext02(appended));
					appended.clear();
					names.clear();
					first_next_split = DataProcess.resetArray01(first_next_split);
					editor_split = DataProcess.resetArray02(editor_split);
					type_split = DataProcess.resetArrayElement(type_split, 2);
					break;
				case "2":
					information.noteofyear();
					String yearStr = "";
					yearStr = scanner.nextLine();
					String yearString = " (" + yearStr + ").";
					appended.add(yearString);
					
					information.noteofbookname();
					String bookname = "";
					bookname = " " + scanner.nextLine() + "(i)";
					appended.add(bookname);
					
					information.noteofedition();
					int edition = Integer.parseInt(scanner.nextLine());
					appended.add(NamePrint.editionCreator(edition));
					
					information.doi01();
					String doi = scanner.nextLine();
					if (doi.equals("1")) {
						information.doi02();
						doi = scanner.nextLine();
						String doiString = " " + doiCreator(doi); 
						appended.add(doiString);
					}else {
						information.doi03();
						String URL = scanner.nextLine();
						String URLString = " " + URLCreator(URL);
						appended.add(URLString);
					}
					break;
				default:
					names.add(scString2);
					break;
				} if (type_split[2] == 1) {
					break;
				}
			}
			type_split[2] = 0;
			break;
		case "3":
			while(type_split[3] == 0) {
				magazineinformation.magazine();
				String scString3 = scanner.nextLine();
				switch(scString3) {
				case "1":
					appended.add(0, getName(names, editor_split[3]));
					print(appended);
					System.out.println("below is the corresponding intext citation");
					System.out.println("First in-text citation:" + getIntextName04(names, first_next_split[3]) + getIntext02(appended));
					first_next_split[3] = 2;
					System.out.println("Subsequent citations:" + getIntextName04(names, first_next_split[3]) + getIntext02(appended));
					appended.clear();
					names.clear();
					first_next_split = DataProcess.resetArray01(first_next_split);
					editor_split = DataProcess.resetArray02(editor_split);
					type_split = DataProcess.resetArrayElement(type_split, 3);//set 1
					break;
				case "2":
					magazineinformation.yaer();
					String yearStr = scanner.nextLine();
					String yearString = " (" + yearStr;
					
					magazineinformation.month();
					String month = scanner.nextLine();
					String montString = ", " + month + ").";
					appended.add(yearString + montString);
					
					magazineinformation.article_title();
					String article = scanner.nextLine();
					String articlString = " " + article + ".";
					appended.add(articlString);
					
					magazineinformation.magazine_title();
					String magazine = " " + scanner.nextLine() + "(i),";
					appended.add(magazine);
					
					magazineinformation.volume();
					String volume = " " + scanner.nextLine() + "(i)";
					if (volume.equals(" " + "1" + "(i)")) {
						appended.add("");
					}else {
						appended.add(volume);
						magazineinformation.issue();
						String issue = "(" + scanner.nextLine() + "),";
						if (issue.equals("(" + "1" + "),")) {
							appended.add(",");
						}else {
							appended.add(issue);
						}
					}
					
					magazineinformation.page_num01();
					String pagString = " " + scanner.nextLine() + ".";
					appended.add(pagString);
					break;
				default:
					names.add(scString3);
					break;
				} if (type_split[3] == 1) {
					break;
				}
			}
			type_split[3] = 0;
			break;
		case "4":
			while(type_split[4] == 0) {
				magazineinformation.magazine();
				String scString4 = scanner.nextLine();
				switch(scString4) {
				case "1":
					appended.add(0, getName(names, editor_split[4]));
					print(appended);
					System.out.println("below is the corresponding intext citation");
					System.out.println("First in-text citation:" + getIntextName04(names, first_next_split[4]) + getIntext02(appended));
					first_next_split[4] = 2;
					System.out.println("Subsequent citations:" + getIntextName04(names, first_next_split[4]) + getIntext02(appended));
					appended.clear();
					names.clear();
					first_next_split = DataProcess.resetArray01(first_next_split);
					editor_split = DataProcess.resetArray02(editor_split);
					type_split = DataProcess.resetArrayElement(type_split, 4);//set 1
					endofsourcename_sign1 = 0;
					endofsourcename_sign2 = 0;
					break;
				case "2":
					magazineinformation.yaer();
					String yearStr = scanner.nextLine();
					String yearString = " (" + yearStr;
					
					magazineinformation.month();
					String month = scanner.nextLine();
					String montString = ", " + month;// + ").";
					
					magazineinformation.day();
					String day = scanner.nextLine();
					String dayString = " " + day + ").";
					appended.add(yearString + montString + dayString);
					
					magazineinformation.article_title();
					String article = scanner.nextLine();
					String articlString = " " + article + ".";
					appended.add(articlString);
					
					magazineinformation.magazine_title();
					String magazine = " " + scanner.nextLine() + "(i),";
					appended.add(magazine);
					
					magazineinformation.volume();
					String volume = " " + scanner.nextLine() + "(i)";
					if (volume.equals(" " + "1" + "(i)")) {
						endofsourcename_sign1 = 1;
						appended.add("");
					}else {
						appended.add(volume);
						magazineinformation.issue();
						String issue = "(" + scanner.nextLine() + "),";
						if (issue.equals("(" + "1" + "),")) {
							appended.add(",");
						}else {
							appended.add(issue);
						}
					}
					
					magazineinformation.page_num01();
					String pagString = " " + scanner.nextLine() + ".";
					appended.add(pagString);
					break;
				default:
					names.add(scString4);
					break;
				} if (type_split[4] == 1) {
					break;
				}
			}
			type_split[4] = 0;
			break;
		case "5":
			while(type_split[5] == 0) {
				magazineinformation.magazine();
				String scString5 = scanner.nextLine();
				switch(scString5) {
				case "1":
					appended.add(0, getName(names, editor_split[5]));
					print(appended);
					System.out.println("below is the corresponding intext citation");
					System.out.println("First in-text citation:" + getIntextName04(names, first_next_split[5]) + getIntext02(appended));
					first_next_split[5] = 2;
					System.out.println("Subsequent citations:" + getIntextName04(names, first_next_split[5]) + getIntext02(appended));
					appended.clear();
					names.clear();
					first_next_split = DataProcess.resetArray01(first_next_split);
					editor_split = DataProcess.resetArray02(editor_split);
					type_split = DataProcess.resetArrayElement(type_split, 5);//set 1
					endofsourcename_sign1 = 0;
					endofsourcename_sign2 = 0;
					break;
				case "2":
					magazineinformation.yaer();
					String yearStr = scanner.nextLine();
					String yearString = " (" + yearStr;
					
					magazineinformation.month();
					String month = scanner.nextLine();
					String montString = ", " + month;// + ").";
					
					magazineinformation.day();
					String day = scanner.nextLine();
					if (day.equals("1")) {
						appended.add(yearString + montString + ").");
					}else {
						String dayString = " " + day + ").";
						appended.add(yearString + montString + dayString);
					}
					
					
					magazineinformation.article_title();
					String article = scanner.nextLine();
					String articlString = " " + article + ".";
					appended.add(articlString);
					
					magazineinformation.magazine_title();
					String magazine01 = scanner.nextLine();
					String magazine = " " + magazine01 + "(i),";
					appended.add(magazine);
					
					magazineinformation.volume();
					String volume = " " + scanner.nextLine() + "(i)";
					if (volume.equals(" " + "1" + "(i)")) {
						endofsourcename_sign1 = 1;
						appended.add("");
					}else {
						appended.add(volume);
						magazineinformation.issue();
						String issue = "(" + scanner.nextLine() + "),";
						if (issue.equals("(" + "1" + "),")) {
							appended.add(",");
						}else {
							appended.add(issue);
						}
					}

					magazineinformation.page_num01();
					String pagString = " " + scanner.nextLine() + ".";
					if (pagString.equals(" " + "1" + ".")) {
						appended.add("");
						endofsourcename_sign2 = 1;
					} else if (pagString.equals(" " + "2" + ".")) {
						List<String> pageStrings = new ArrayList<String>(); 
						String returnString = "";
						while(true) {
							magazineinformation.page_num02();
							String pageString = scanner.nextLine();
							if (pageString.equals("2")) {
								break;
							}else {
								pageStrings.add(pageString);
							}
						}
						for (int i = 0; i < pageStrings.size(); i++) {
							if (i == pageStrings.size() - 1) {
								returnString += pageStrings.get(i) + "."; 
							}else if (i == 0){
								returnString += " " + pageStrings.get(i) + ", ";
							}else{
								returnString += pageStrings.get(i) + ", ";
							}
						}
						appended.add(returnString);
						pageStrings.clear();
					} else {
						appended.add(pagString);
					}
					
					magazineinformation.URL();
					String URL = " Retrieved from " + scanner.nextLine();
					appended.add(URL);
					
					if (endofsourcename_sign1 == 1 && endofsourcename_sign2 == 1) {
						appended.remove(appended.size() - 4);
						appended.add(appended.size() - 3, " " + magazine01 + "(i).");
					}
					break;
				default:
					names.add(scString5);
					break;
				} if (type_split[5] == 1) {
					break;
				}
			}
			type_split[5] = 0;
			break;
		case "6":
			while(type_split[6] == 0) {
				magazineinformation.magazine();
				String scString5 = scanner.nextLine();
				switch(scString5) {
				case "1":
					appended.add(0, getName(names, editor_split[6]));
					print(appended);
					System.out.println("below is the corresponding intext citation");
					System.out.println("First in-text citation:" + getIntextName04(names, first_next_split[6]) + getIntext02(appended));
					first_next_split[6] = 2;
					System.out.println("Subsequent citations:" + getIntextName04(names, first_next_split[6]) + getIntext02(appended));
					appended.clear();
					names.clear();
					first_next_split = DataProcess.resetArray01(first_next_split);
					editor_split = DataProcess.resetArray02(editor_split);
					type_split = DataProcess.resetArrayElement(type_split, 6);//set 1
					endofsourcename_sign1 = 0;
					endofsourcename_sign2 = 0;
					break;
				case "2":
					magazineinformation.yaer();
					String yearStr = scanner.nextLine();
					String yearString = " (" + yearStr;
					
					magazineinformation.month();
					String month = scanner.nextLine();
					String montString = ", " + month;// + ").";
					
					magazineinformation.day();
					String day = scanner.nextLine();
					String dayString = " " + day + ").";
					appended.add(yearString + montString + dayString);
					
					magazineinformation.article_title();
					String article = scanner.nextLine();
					String articlString = " " + article + ".";
					appended.add(articlString);
					
					magazineinformation.magazine_title();
					String magazine01 = scanner.nextLine();
					String magazine = " " + magazine01 + "(i),";
					appended.add(magazine);
					
					magazineinformation.page_num01();
					String pagString = " " + scanner.nextLine() + ".";
					if (pagString.equals(" " + "1" + ".")) {
						appended.add("");
						endofsourcename_sign2 = 1;
					} else if (pagString.equals(" " + "2" + ".")) {
						List<String> pageStrings = new ArrayList<String>(); 
						String returnString = "";
						while(true) {
							magazineinformation.page_num02();
							String pageString = scanner.nextLine();
							if (pageString.equals("2")) {
								break;
							}else {
								pageStrings.add(pageString);
							}
						}
						for (int i = 0; i < pageStrings.size(); i++) {
							if (i == pageStrings.size() - 1) {
								returnString += pageStrings.get(i) + "."; 
							}else if (i == 0){
								returnString += " p. " + pageStrings.get(i) + ", ";
							}else{
								returnString += pageStrings.get(i) + ", ";
							}
						}
						appended.add(returnString);
						pageStrings.clear();
					} else {
						appended.add(pagString);
					}
					
					if (endofsourcename_sign2 == 1) {
						appended.remove(appended.size() - 2);
						appended.add(appended.size() - 1, " " + magazine01 + "(i).");
					}
					break;
				default:
					names.add(scString5);
					break;
				} if (type_split[6] == 1) {
					break;
				}
			}
			type_split[6] = 0;
			break;
		case "7":
			while(type_split[7] == 0) {
				magazineinformation.magazine();
				String scString5 = scanner.nextLine();
				switch(scString5) {
				case "1":
					appended.add(0, getName(names, editor_split[7]));
					print(appended);
					System.out.println("below is the corresponding intext citation");
					System.out.println("First in-text citation:" + getIntextName04(names, first_next_split[7]) + getIntext02(appended));
					first_next_split[7] = 2;
					System.out.println("Subsequent citations:" + getIntextName04(names, first_next_split[7]) + getIntext02(appended));
					appended.clear();
					names.clear();
					first_next_split = DataProcess.resetArray01(first_next_split);
					editor_split = DataProcess.resetArray02(editor_split);
					type_split = DataProcess.resetArrayElement(type_split, 7);//set 1
					endofsourcename_sign1 = 0;
					endofsourcename_sign2 = 0;
					break;
				case "2":
					magazineinformation.yaer();
					String yearStr = scanner.nextLine();
					String yearString = " (" + yearStr;
					
					magazineinformation.month();
					String month = scanner.nextLine();
					String montString = ", " + month;// + ").";
					
					magazineinformation.day();
					String day = scanner.nextLine();
					String dayString = " " + day + ").";
					appended.add(yearString + montString + dayString);
					
					magazineinformation.article_title();
					String article = scanner.nextLine();
					String articlString = " " + article + ".";
					appended.add(articlString);
					
					magazineinformation.magazine_title();
					String magazine01 = scanner.nextLine();
					String magazine = " " + magazine01 + "(i).";
					appended.add(magazine);
					
					magazineinformation.URL();
					String URL = " Retrieved from " + scanner.nextLine();
					appended.add(URL);
					break;
				default:
					names.add(scString5);
					break;
				} if (type_split[7] == 1) {
					break;
				}
			}
			type_split[7] = 0;
			break;
		case "9":
			while (type_split[8] == 0) {
				journalinformation.journal();
				String scString2 = scanner.nextLine();
				switch(scString2) {
				case "1":
					appended.add(0, getName(names, editor_split[8]));
					print(appended);
					System.out.println("below is the corresponding interest citation");
					System.out.println("First in-text citation:" + getIntextName04(names, first_next_split[8]) +getIntext02(appended));
					first_next_split[8] = 2;
					System.out.println("Subsequent citations:" + getIntextName04(names, first_next_split[8]) + getIntext02(appended));
					appended.clear();
					names.clear();
					first_next_split = DataProcess.resetArray01(first_next_split);//set 1
					editor_split = DataProcess.resetArray02(editor_split);//set 0
					type_split = DataProcess.resetArrayElement(type_split, 8);//set 1 for the second position
					endofsourcename_sign1 = 0;
					endofsourcename_sign2 = 0;
					break;
				case "2":
					journalinformation.noteofyear();
					String yearString = " (" + scanner.nextLine() + ").";
					appended.add(yearString);
					
					journalinformation.nameofarticle();
					String article = " " + scanner.nextLine() + ".";
					appended.add(article);
					
					journalinformation.nameofjournal();
					String journal01 = scanner.nextLine();
					String journal = " " + journal01 + "(i),";
					appended.add(journal);
					
					magazineinformation.volume();
					String volume = " " + scanner.nextLine() + "(i)";
					if (volume.equals(" " + "1" + "(i)")) {
						endofsourcename_sign1 = 1;
						appended.add("");
					}else {
						appended.add(volume);
						magazineinformation.issue();
						String issue = "(" + scanner.nextLine() + "),";
						if (issue.equals("(" + "1" + "),")) {
							appended.add(",");
						}else {
							appended.add(issue);
						}
					}
				
					journalinformation.page();
					String pagString = " " + scanner.nextLine() + ".";
					if (pagString.equals(" " + "1" + ".")) {
						appended.add("");
						endofsourcename_sign2 = 1;
					} else if (pagString.equals(" " + "2" + ".")) {
						List<String> pageStrings = new ArrayList<String>(); 
						String returnString = "";
						while(true) {
							magazineinformation.page_num02();
							String pageString = scanner.nextLine();
							if (pageString.equals("2")) {
								break;
							}else {
								pageStrings.add(pageString);
							}
						}
						for (int i = 0; i < pageStrings.size(); i++) {
							if (i == pageStrings.size() - 1) {
								returnString += pageStrings.get(i) + "."; 
							}else if (i == 0){
								returnString += " p. " + pageStrings.get(i) + ", ";
							}else{
								returnString += pageStrings.get(i) + ", ";
							}
						}
						appended.add(returnString);
						pageStrings.clear();
					} else {
						appended.add(pagString);
					}
					if (endofsourcename_sign2 == 1 && endofsourcename_sign2 == 1) {
						appended.remove(appended.size() - 2);
						appended.add(appended.size() - 1, " " +journal01 + "(i).");
					}
					
					information.doi01();
					String doi = scanner.nextLine();
					if (doi.equals("1")) {
						information.doi02();
						doi = scanner.nextLine();
						String doiString = " " + doiCreator(doi); 
						appended.add(doiString);
					}else {
						information.doi03();
						String URL = scanner.nextLine();
						String URLString = " " + URLCreator(URL);
						appended.add(URLString);
					}
					
					if (endofsourcename_sign1 == 1 && endofsourcename_sign2 == 1) {
						appended.remove(appended.size() - 4);
						appended.add(appended.size() - 3, " " + journal01 + "(i).");
					}
					break;
				default:
					names.add(scString2);
					break;
				} if (type_split[8] == 1) {
					break;
				}
			}
			type_split[8] = 0;//set 0
			break;
		case "10":
			while (type_split[9] == 0) {
				//thesisinformation.noteofthesis();
				thesisinformation.begin();
				String sc = scanner.nextLine();
				switch (sc) {
				case "1":
					appended.add(0, getName(names, editor_split[9]));
					print(appended);
					System.out.println("below is the corresponding intext citation");
					System.out.println("First in-text citation:" + getIntextName04(names, first_next_split[9]) + getIntext02(appended));
					first_next_split[9] = 2;
					System.out.println("Subsequent citations:" + getIntextName04(names, first_next_split[9]) + getIntext02(appended));
					appended.clear();
					names.clear();
					first_next_split = DataProcess.resetArray01(first_next_split);
					editor_split = DataProcess.resetArray02(editor_split);
					type_split = DataProcess.resetArrayElement(type_split, 9);//set 1
					break;
					case "2"://master thesis
							thesisinformation.noteofyear();
							String yearStr = "";
							yearStr = scanner.nextLine();
							String yearString = " (" + yearStr + ").";
							appended.add(yearString);
							
							thesisinformation.nameofthethesis();
							String thesisname = "";
							thesisname = " " + scanner.nextLine() + "(i)";
							appended.add(thesisname);
							
							
							thesisinformation.noteofthesis();
							int level = 0;			
							String reString = "";
							String choose = scanner.nextLine();
							if (choose.equals("1")) {
								thesisinformation.levelofthethesis();
								level = Integer.parseInt(scanner.nextLine());
								if (level == 1) {
									reString = " (Unpublished master's thesis).";
								}else {
									reString = " (Master's thesis).";
								}
							} else {
								thesisinformation.levelofthediss();
								level = Integer.parseInt(scanner.nextLine());
								if (level == 1) {
									reString = " (Unpublished doctoral thesis).";

								}else {
									reString = " (Doctoral thesis).";
								}
							}
							appended.add(reString);
							
							
							thesisinformation.nameoftheuniversity();
							String university01 = scanner.nextLine();
							String university02 = " " + university01 + ",";
							appended.add(university02);
							
							thesisinformation.cityoftheuniversity();
							String cityString01 = scanner.nextLine();
							String cityString02 = " " + cityString01 + ",";
							appended.add(cityString02);
							
							thesisinformation.countryoftheuniversity();
							String country01 = scanner.nextLine();
							String country02 = " " + country01 + ".";
							appended.add(country02);
							
							thesisinformation.URL01();
							String uString01 = scanner.nextLine();
							int URLexist = 2;//need to be reset
							String uString02 = "";
							if (uString01.equals("1")) {
								URLexist = 1;
								thesisinformation.URL02();
								uString02 = " Retrieved from " + scanner.nextLine();
								appended.add(uString02);
							}else {
								URLexist = 0;
								appended.add("");
							}
							if (URLexist == 1) {
								String caString01 = reString;
								String caString02 = caString01.substring(0, caString01.length() - 2) + ",";
								String caString03 = university02 + cityString02 + country02;
								String caString04 = caString03.substring(0, caString03.length() - 1) + ").";
								String caString05 = caString02 + caString04;
								for (int i = 1; i < 6; i++) {
									appended.remove(appended.size() - 1);
								}
								appended.add(caString05);
								appended.add(uString02);
							}
							break;//这个break不加的话, 执行玩case 2之后, 继续执行default, 会把2加进names
				default:
					names.add(sc);
					break;
				} if (type_split[9] == 1) {
					break;
				}
			}
			type_split[9] = 0;//set 0
			break;
		}
	}
}
	
	
	public static String doiCreator(String doi) {
		String doiString = "doi: " + doi;
		return doiString;
	}
	
	public static String URLCreator(String URL) {
		String urlString = "Retrieved from " + URL;
		return urlString;
	}
	
	public static String uRLexString(int level) {
		if (level == 1) {
			String reString01 = " (Unpublished master's thesis).";
			return reString01;
		}else {
			String reString02 = " (Master's thesis).";
			return reString02;
		}
	}
	//--------------------------------------------------------in-text citation
	//get the year part in the citation for first time and next time citation
		public static String getIntext02(List<String> appended) {
			String intextyer = "";
			intextyer = appended.get(1);
			return intextyer.substring(2, 6) + ")";
		}
	//get the name part in the citation for first time and next time citation
		public static String getIntextName04(List<String> names, int first_next_split) {
			String intextName = "";
			if (names.size() < 3) {
				intextName = "(" + getIntextName(names) + " ";
				return intextName;
			}else if (names.size() > 2 && names.size() < 6 && first_next_split == 1) {
				intextName = "(" + getIntextName(names) + " ";
				return intextName;
			}
			else if (names.size() > 2 && names.size() < 6 && first_next_split == 2){
				intextName = "(" + intextNameConvert(names.get(0)) + " et al., ";
				return intextName;
			}else if (names.size() > 5) {
				intextName = "(" + intextNameConvert(names.get(0)) + " et al., ";
			}
			return intextName;
		}
	//create the name String for first time citation
		public static String getIntextName(List<String> intext) {
			String intextName = "";
			if (intext.size() == 1) {
				intextName = intextNameConvert(intext.get(0)) + ",";
			}else if (intext.size() == 2){
				intextName = intextNameConvert(intext.get(0)) +" & " + intextNameConvert(intext.get(1)) + ",";
			}else if (intext.size() > 2 && intext.size() < 6) {
				for (int i = 0; i < intext.size(); i++) {
					if (i == intext.size() -1) {
						intextName += "& " + intextNameConvert(intext.get(i)) + ",";
						break;
					}
					intextName += intextNameConvert(intext.get(i)) + ", ";
				}
			}else {
				intextName = intextNameConvert(intext.get(0)) + " et al.,";
			}
			return intextName;
		}
	//create the purely one single name for citation
		public static String intextNameConvert(String name) {
			String[] split = name.split(" ");
			if (split.length == 2) {
				return split[1];
			} else {
				return split[2];
			}
		}
//-------------------------------------------------reference list
	public static void print(List<String> appended) {
			String finalString = "";
		for (int i = 0; i < appended.size(); i ++) {
			finalString += appended.get(i);
		}
		System.out.println(finalString);
	}
	public static String editionCreator(int edition) {
		if (edition == 1)
		return ".";
		else if (edition == 2){
			return " (" + edition + "nd" + " ed.).";
		}
		else if (edition == 3){
			return " (" + edition + "rd" + " ed.).";
		}
		else {
			return " (" + edition + "th" + " ed.).";
		}
	}
	
	public static String getName(List<String> names, int editor_split) {
		if (editor_split == 0) {
			String printString = "";
			if (names.size() == 1) {
				printString = nameConvert(names.get(0));
			} else if (names.size() > 1 && names.size() <= 7) {
				for (int i = 0; i < names.size(); i++) {
					if (i == names.size() - 1) {
						printString += "& " + nameConvert(names.get(i));
					} else {
						printString += nameConvert(names.get(i)) + ", ";
					}
				}
			} else {
				for (int i = 0; i < names.size(); i++) {
					if (i == 6) {
						printString += "... ";
					} else if (i >= 0 && i < 6) {
						printString += nameConvert(names.get(i)) + ", ";
					} else {
						printString += nameConvert(names.get(i));
					}
				}
			}
			return printString;
		}
			else {
				String printString = "";
				if (names.size() == 1) {
					printString = nameConvert(names.get(0));
				} else if (names.size() > 1 && names.size() <= 7) {
					for (int i = 0; i < names.size(); i++) {
						if (i == names.size() - 1) {
							printString += "& " + nameConvert(names.get(i));
						} else {
							printString += nameConvert(names.get(i)) + ", ";
						}
					}
				} else {
					for (int i = 0; i < names.size(); i++) {
						if (i == 6) {
							printString += "... ";
						} else if (i >= 0 && i < 6) {
							printString += nameConvert(names.get(i)) + ", ";
						} else {
							printString += nameConvert(names.get(i));
						}
					}
				}
				if (names.size() == 1) {
				return printString + " (Ed.).";
			}else {
				return printString + " (Eds.).";
			}
		}
	}
	public static String nameConvert(String name) {
		String[] split = name.split(" ");
		if (split.length == 2) {
			return split[1] + ", " + split[0].substring(0, 1) + ".";
		} else {
			return split[2] + ", " + split[0].substring(0, 1) + ". " + split[1].substring(0, 1) + ".";
		}
	}
}