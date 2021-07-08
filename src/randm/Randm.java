package randm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Randm {
	public static void main(String[] args) {
		int max = 25000;
		int min = 10;
		Random rn = new Random(500);
		Set<Integer> uniqueset = new TreeSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		Map<Integer, Object> numberMap = new HashMap<Integer, Object>();
		Scanner userinput = new Scanner(System.in);
		for (int i = 1; i < 501; i++) {

			int answer = rn.nextInt(max - min + 1) + min;
			System.out.println(answer);
			list.add(answer);

		}

		// System.out.println(list);
		// System.out.println(list.size());

		uniqueset = new TreeSet<Integer>(list);

		// System.out.println(uniqueset);
		// System.out.println(uniqueset.size());
		list1.addAll(uniqueset);

		if (list1 != null) {
			int a = 1;

			for (int inte : list1) {

				numberMap.put(a, inte);

				a++;

			}

		}
		 System.out.println(numberMap);
		System.out.println("which smallest number in the list you want to know? ");
		int data = userinput.nextInt();
		System.out.println(numberMap.get(data));
	}

}
