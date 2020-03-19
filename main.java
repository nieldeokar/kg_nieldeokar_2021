import java.util.*;

public class main {
	
	public static void main(String[] args) {

		if(args == null || args.length < 2){
			System.out.println("Program needs 2 command line arguments, String1 and String2 ");
			return;
		}

		if(args[0] == null || args[1] == null){
			System.out.println("Arguments can not be null");
			return;
		}

		char[] s1Chars = args[0].toCharArray();
		char[] s2Chars = args[1].toCharArray();
		if(s1Chars.length > s2Chars.length){
			System.out.println("False");
			return;
		}

		boolean flag = true;

		HashMap<Character, Integer> frequenciesOfStr1 = new HashMap<>();
		HashMap<Character, Integer> frequenciesOfStr2 = new HashMap<>();

		for (char c : s1Chars) {
			if (frequenciesOfStr1.containsKey(c)) {
				frequenciesOfStr1.put(c, frequenciesOfStr1.get(c) + 1);
			} else
				frequenciesOfStr1.put(c, 1);
		}

		for (char c : s2Chars) {
			if (frequenciesOfStr2.containsKey(c)) {
				frequenciesOfStr2.put(c, frequenciesOfStr2.get(c) + 1);
			} else
				frequenciesOfStr2.put(c, 1);
		}

		PriorityQueue<Integer> pQueue1 = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> pQueue2 = new PriorityQueue<>(Collections.reverseOrder());

		for(Map.Entry<Character,Integer> entry : frequenciesOfStr1.entrySet()) {
			pQueue1.add(entry.getValue());
		}

		for(Map.Entry<Character,Integer> entry : frequenciesOfStr2.entrySet()) {
			pQueue2.add(entry.getValue());
		}

		Iterator it = pQueue1.iterator();
		while (it.hasNext()) {
			Integer maxFreqOfStr1 = pQueue1.peek();
			Integer maxFreqOfStr2 = pQueue2.peek();
			if(maxFreqOfStr1 != null && maxFreqOfStr2 != null ){
				if(maxFreqOfStr1 <= maxFreqOfStr2){
					int diff = pQueue2.remove() - pQueue1.remove();
					if(diff > 0){
						pQueue2.add(diff);
					}
				}else {
					flag = false;
					break;
				}
			}else if(maxFreqOfStr1 == null && maxFreqOfStr2 != null){
				break;
			}else if(maxFreqOfStr1 != null){
				flag = false;
				break;
			}
		}
        
		System.out.println(flag);
	}
}