package NamePrint;

public class DataProcess {
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