import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		//Integers Class Problem 1
		/*
		ArrayList<Integer> testInts = new ArrayList();
		testInts.add(5);
		testInts.add(10);
		testInts.add(15);
		testInts.add(20);
		
		System.out.println(Integers.computeSum(testInts));
		*/
		
		
		
		//Date Class Problem 2
		/*
		Date d1 = new Date (2, 20, 2020);
		Date d2 = new Date (5, 10, 2020);
		Date d3 = new Date (7, 26, 2015);
		Date d4 = new Date (1, 14, 2000);
		*/
		
		/*
		if(d1.compareTo(d2)==1) {
			System.out.println(d1 + " is later than " + d2);
		}else if(d1.compareTo(d2) == -1) {
			System.out.println(d1 + " is earlier than " + d2);
		}else {
			System.out.println(d1 + " and " + d2 + " are the same dates...");
		}
		*/
		
		//TreeMap Problem 3
		/*
		TreeMap<Date, String> syllabus = new TreeMap();
		syllabus.put(d1, "java");
		syllabus.put(d2, "Python");
		syllabus.put(d3, "C++");
		syllabus.put(d4, "Javascript");
		
		for(Map.Entry<Date, String> topic: syllabus.entrySet()) {
			if(topic.getKey().month == 9 && topic.getKey().year == 2002) {
				System.out.println(topic.getValue());
			}else {
				System.out.println(topic.getKey() + " does not fall in September, 2002");
			}
		}
		*/
		
		//problem 4
		System.out.println(Square.getSquare2(2,3));
	}
		
}

