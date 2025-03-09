class Esercitazione1 {
	public static void main(String[] args) {
		float r1 = result1();
		System.out.println(String.format("Res1 = %.2f", r1));

		int r2 = result2();
		System.out.println(String.format("Res2 = %d", r2));

		float r3 = result3();
		System.out.println(String.format("Res3 = %.2f", r3));

		float r4 = result4(r1, r2, r3);
		System.out.println(String.format("Res4 = %.2f", r4));
	}

	private static float result1() {
		int a = 5;
		int b = 3;
		
		return a / b;
	}

	private static int result2() {
		char c = 'a';
		short s = 5000;

		return c * s; 
	}

	private static float result3() {
		int i = 6;
		float f = 3.14F;

		return i + f;
	}

	private static float result4(float r1, int r2, float r3) {
		return r1 - r2 - r3;
	}
}
