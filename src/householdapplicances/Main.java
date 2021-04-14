package householdapplicances;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		HashMap<String, Appliance> map = new HashMap<String, Appliance>();
		
		map.put("Light", new Light(false));
		map.put("Tv", new Tv(false));
		map.put("Fan", new Fan(true));
		int sum = map.values().stream().mapToInt(d -> d.powerConsumption()).sum();
		System.out.println(sum);

		LinkedHashMap<String, Appliance> result = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));
		System.out.println(result);
		
		Map<String,Appliance> sortedMap = map.entrySet().stream()
                .sorted((e1,e2)->Integer.compare(e2.getValue().powerConsumption(),e1.getValue().powerConsumption()))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	
		sortedMap.forEach((key,val)->{
		    System.out.println(key+ " = "+ val.toString());
		});

	}

}
