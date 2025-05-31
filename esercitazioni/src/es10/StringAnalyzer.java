package es10;

import java.util.Map;
import java.util.HashMap;

public class StringAnalyzer {
	private final Map<String, Integer> map;

	public StringAnalyzer(String s) {
		this.map = processString(s);
	}

	private Map<String, Integer> processString(String s) {
		final Map<String, Integer> map = new HashMap<String, Integer>();
		final String[] sSplit = s.split(" ");

		for (String i : sSplit) {
			final Integer previous = map.get(i);

			if (previous != null) {
				map.put(i, previous + 1);
			} else {
				map.put(i, 1);
			}
		}

		return map;
	}

	@Override public String toString() {
		return map.toString();
	}
}
