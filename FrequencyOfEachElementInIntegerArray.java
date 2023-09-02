package Testing;

import java.util.HashMap;

public class FrequencyOfEachElementInIntegerArray {

	public static void main(String[] args) {
		int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
        HashMap<Integer,Integer> charFreqMap = new HashMap<>();
      for(int i : arr) {
         if(charFreqMap.containsKey(i)) {
            charFreqMap.put(i,charFreqMap.get(i) + 1);
         } else {
             charFreqMap.put(i,1);
         } }
      System.out.println(charFreqMap);

	}

}
