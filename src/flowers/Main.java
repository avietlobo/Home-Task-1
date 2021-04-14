package flowers;

import java.util.HashMap;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Supplier<Flower>> map = new HashMap<String, Supplier<Flower>>();
		map.put("Rose", () -> new Rose(70));
		map.put("Lily", () -> new Lily(30));
		map.put("Petunia", () -> new Petunia(180));
		double sum = map.values().stream().mapToDouble(d -> d.get().cost()).sum();
		System.out.println(sum);

	}

}
