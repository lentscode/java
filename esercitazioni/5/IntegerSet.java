class IntegerSetTest {
	public static void main(String[] args) {
		final IntegerSet i1 = new IntegerSet();
		final IntegerSet i2 = new IntegerSet();

		i1.insertElement(43);
		i1.insertElement(54);
		i2.insertElement(43);
		i2.insertElement(8);

		System.out.println(i1.toString());

		final IntegerSet union = i1.unionOfIntegerSet(i2);
		final IntegerSet intersection = i1.intersectionOfIntegerSet(i2);

		System.out.println(union.toString());
		System.out.println(intersection.toString());

		i1.deleteElement(43);
		
		System.out.println(i1.toString());
	}
}

class IntegerSet {
	private boolean[] list;

	public IntegerSet() {
		list = new boolean[100];
	}

	private IntegerSet(boolean[] list) {
		this.list = list;
	}

	public IntegerSet unionOfIntegerSet(IntegerSet b) {
		boolean[] list = new boolean[100];

		for (int i = 0; i < list.length; i++) {
			list[i] = this.list[i] || b.list[i];
		}

		return new IntegerSet(list);
	}

	public IntegerSet intersectionOfIntegerSet(IntegerSet b) {
		boolean[] list = new boolean[100];

		for (int i = 0; i < list.length; i++) {
			list[i] = this.list[i] && b.list[i];
		}

		return new IntegerSet(list);
	}

	public void insertElement(int n) {
		if (n < 0 || n > 99) {
			System.out.println("Number out of bounds");
			return;
		}

		list[n] = true;
	}

	public void deleteElement(int n) {
		if (n < 0 || n > 99) {
			System.out.println("Number out of bounds");
			return;
		}

		list[n] = false;
	}

	public String toString() {
		String res = "[";

		for (int i = 0; i < list.length; i++) {
			if (!list[i]) continue;

			res += String.format("%d ", i);
		}

		res += "]";

		return res;
	}
}

