package no.hvl.dat100.lab5.tabeller;

import com.sun.beans.decoder.ValueObject;
import com.sun.jdi.Value;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		System.out.print("[");
		String s = Integer.toString(tabell[0]) + "," + tabell[1] + "," + tabell[2];
		System.out.print(s);
		System.out.print("]");
		return null;
	}

	// c)
	public static int summer(int[] tabell) {

		// Vanlig for løkke
		int sum = 0;
		for(int i = 0; i<tabell.length; i++) {
			sum+=tabell[i];
		}
		return sum;

//		// Utvidet for løkke
//		int sum = 0;
//		for (int i : tabell) {
//			sum += i;
//		}
//		return sum;

		// While løkke
//		int i = 0;
//		int sum = 0;
//		while (i < tabell.length) {
//			sum += tabell[i];
//			i++;
//		}
//		return sum;

		
	}

	public static void skrivUtmatrise(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j]);
			}
		}
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				funnet = true;
			}

		}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int pos = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int v = 0;
		int h = tabell.length - 1;
		while (v < h) {
			int r = tabell[v];
			tabell[v] = tabell[h];
			tabell[h] = r;
			v++;
			h--;
		}
		return tabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		int i = 1;
		while (sortert && i < tabell.length) {
			if (tabell[i - 1] <= tabell[i])
				i++;
			else
				sortert = false;
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyLengde = tabell1.length + tabell2.length;
		int[] nyTab = new int[nyLengde];
		for (int i = 0; i < tabell1.length; i++) {
			nyTab[i] = tabell1[i];
		}
		for (int j = 0; j < tabell2.length; j++) {
			nyTab[tabell1.length + j] = tabell2[j];
		}
		return nyTab;
	}

}
