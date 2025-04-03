import java.util.ArrayList;

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
	private ArrayList<Integer> list;

	public IntegerSet() {
		list = new ArrayList<Integer>();
	}

	private IntegerSet(ArrayList<Integer> list) {
		this.list = list;
	}

	public IntegerSet unionOfIntegerSet(IntegerSet b) {
		ArrayList<Integer> list = new ArrayList<Integer>(this.list);

		for (int i = 0; i < b.list.size(); i++) {
			if (list.contains(b.list.get(i))) continue;

			list.add(b.list.get(i));
		}

		return new IntegerSet(list);
	}

	public IntegerSet intersectionOfIntegerSet(IntegerSet b) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < this.list.size(); i++) {
			if (!b.list.contains(this.list.get(i))) continue;

			list.add(this.list.get(i));
		}

		return new IntegerSet(list);
	}

	public void insertElement(int n) {
		if (n < 0 || n > 99) {
			System.out.println("Number out of bounds");
			return;
		}

		if (list.contains(n)) {
			System.out.println("Number already present");
			return;
		}

		list.add(n);
	}

	public void deleteElement(int n) {
		if (n < 0 || n > 99) {
			System.out.println("Number out of bounds");
			return;
		}

		if (!list.contains(n)) {
			System.out.println("Number not present");
			return;
		}

		Integer element = n;
		
		list.remove(element);
	}

	public String toString() {
		String res = "[";

		for (int i = 0; i < list.size(); i++) {
			res += String.format("%d ", list.get(i));
		}

		res += "]";

		return res;
	}
}

