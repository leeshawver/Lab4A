import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab4A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder ints = new StringBuilder("");
		for (int i = 0; i < 10; i++) {
			ints.append(i + "-");
			if (i == 9) {
				ints.delete(ints.length() - 1, ints.length());
			}
		}
		//ints.append("9");
		System.out.println(ints);
		
		List<String> names = Arrays.asList("Bob", "Suzy", "Robin", "Hayden", "Coincidence");
//		names.add("Bob");
//		names.add("Suzy");
//		names.add("Robin");
//		names.add("Hayden");
//		names.add("Coincidence");
		System.out.println(names);
		
		List<String> newNames = Arrays.asList("bo", "b", "harold", "sven", "steven");
		//shortestName(newNames);
		//switchNames(names);
		System.out.println(concatNames(names));
		
	}
	
	public static String shortestName(List<String> newNames) {
		//int nameLength = 500;
		String shortest = newNames.get(0);
		for (String name : newNames) {
			if (name.length() < shortest.length()) {
				shortest = name;
				//nameLength = name.length();
			}
		}
		
		System.out.println(shortest);
		return shortest;
	}
	public static List<String> switchNames(List<String> names) {
		String nameTemp = names.get(0);
		names.set(0, names.get(names.size() - 1));
		names.set(names.size() - 1, nameTemp);
		System.out.println(names);
		return names;
	}
	
	public static String concatNames(List<String> names) {
		StringBuilder hugeName = new StringBuilder();
		for (String name : names) {
			hugeName.append(name + ", ");
		}
		hugeName.delete(hugeName.length() - 2, hugeName.length());
		return hugeName.toString();
	}
}
