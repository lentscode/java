public class Calcolatrice {
	double[] generaVettore(int L) {
		double[] vettore = new double[L];

		for (int i = 0; i < vettore.length; i++) {
			vettore[i] = Math.random() * 1000;
		}

		return vettore;
	}

	double[] sommaVettori(double[] a, double[] b) {
		if (a.length != b.length) {
			return a;
		}

		double[] result = new double[a.length];

		for (int i = 0; i < result.length; i++) {
			result[i] = a[i] + b[i];
		}

		return result;
	}

	double[] concatenaVettori(double[] a, double[] b) {
		double[] result = a.clone();

		for (int i = a.length; i < a.length + b.length; i++) {
			result[i] = b[i - a.length];
		}

		return result;
	} 

	void stampaVettore(double[] a) {
		System.out.print("[ ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);

			System.out.print(i == a.length - 1 ? ", " : " ");
		}

		System.out.println("]");
	}

	double[][] generaMatrici(int R, int C) {
		double[][] matrice = new double[R][C];

		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++ {
				matrice[i][j] = Math.random() * 100;
			}
		}

		return matrice;
	}

	double[][] sommaMatrici(double[][] a, double[][] b) {
		if (a.length != b.length) {
			return a;
		}

		for ()
	}
}
