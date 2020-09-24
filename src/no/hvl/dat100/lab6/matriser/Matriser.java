package no.hvl.dat100.lab6.matriser;

import java.util.Arrays;

import com.sun.org.apache.xerces.internal.dom.DeepNodeListImpl;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j]);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
			}
			System.out.print("\\n");
		}
		return null;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] nyMatrise = new int[matrise.length][];
		for (int i = 0; i < matrise.length; i++) {
			nyMatrise[i] = new int[matrise[i].length];
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
				System.out.print(nyMatrise[i][j] + " ");
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean lik = false;
		if (Arrays.deepEquals(a, b)) {
			lik = true;
			System.out.println("True, tabellene er like");
		} else {
			System.out.println("False, tabellene er ikke like");
		}
		return lik;
	
	}

	// e)
	public static int[][] speile(int[][] matrise) {
		int x = 0;
		for (int i=0; i<matrise.length; i++)
	      for (int j=0; j<i; j++) {
	        x = matrise[i][j];
	        matrise[i][j] = matrise[j][i];
	        matrise[j][i] = x;
	      }
		return null;

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
