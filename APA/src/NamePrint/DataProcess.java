package NamePrint;

public class DataProcess {
//	public static void main(String[] args) {
//		int[] first_next_split = new int[10];
//		first_next_split = resetArray(first_next_split);
//		
//		for (int i = 0; i < first_next_split.length; i++) {
//			System.out.println(first_next_split[i]);
//		}
//	}
	public static int[] resetArray01(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = 1; 
		}
		return a;
	}
	public static int[] resetArray02(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = 0; 
		}
		return a;
	}
	public static int[] resetArrayElement(int[] a, int b) {
		a[b] = 1;
		return a;
	}
}