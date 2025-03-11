package prg.es03;

import java.lang.Math;

public class SommaVettori {
	public static void main(String[] args) {
		double[] vettore1 = new double[10];
		double[] vettore2 = new double[10];
		int[] vettore3 = new int[10];

		for (int i = 0; i < vettore1.length; i++) {
			vettore1[i] = Math.random() * 1000.0; 
			vettore2[i] = Math.random() * 1000.0; 
			
			vettore3[i] = (int)(vettore1[i] + vettore2[i]);
		}

		for (int i = 0; i < vettore3.length; i++) {
			System.out.println(vettore3[i]);
		}
	}
}

