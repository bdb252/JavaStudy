import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		int N = scanner.nextInt();
		scanner.nextLine();
		String str = scanner.nextLine();
		String[] student = str.split(" ");
		
		for(String s : student) {
			map.put(s, 0);
		}
		/*
		Set<String> keys = map.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			Integer value = map.get(key);
			System.out.println(String.format("%s:%s", key, value));
		}
		*/
		for(int i= 0; i<N; i++) {
			if(scanner.hasNextLine()) {
				String name = scanner.nextLine();
				String[] parsingName = name.split(" ");
				for(String tmp : parsingName) {
					map.put(tmp, map.get(tmp) + 1);
				}
				
			}
		}
		
		List<String> keySet = new ArrayList<String>(map.keySet());
//		keySet.sort(new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return map.get(o2).compareTo(map.get(o1));
//			}
//		});
		keySet.sort((o1, o2) -> {
            int cmp = map.get(o2).compareTo(map.get(o1)); // 출석 횟수 내림차순
            if (cmp == 0) return o1.compareTo(o2); // 출석 횟수가 같다면 이름 오름차순
            return cmp;
        });
		for(String key : keySet) {
			Integer value = map.get(key);
			System.out.println(String.format("%s %d", key, value));
		}
		scanner.close();
	}
}
