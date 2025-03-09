import java.util.*;

class NumeriPrimi {
	public static void main(String[] args) {
		List<int> numeriPrimi = new ArrayList();

		int current = 2;

		while (current < 100) {
			boolean primo = true;
			for (int i = 0; i < numeriPrimi.size(); i++) {
				if (current % numeriPrimi[i] == 0) {
					primo = false;
					break;
				}
			}

			if (primo) {
				numeriPrimi.add(current);
			}

			current++;
		}

		System.out.println(numeriPrimi);
	}
}
