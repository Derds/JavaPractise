import java.util.*;

/**
 * Given a list of integers, return the integers occuring K times.
 * If multiple numbers match the k frequency, return a distinct list of those numbers.
 * 
 * Given [6,1,1,6,6,6,3,4]
 * if k = 1, then return [3,4]
 * if k = 2, then return [1]
 * if k = 3, then return []
 * if k = 4, then return [6]
 * 
 */

public class Solution {
   /**
    * @param numbers A list of numbers provided by the caller. Argument is non-null. Values are any valid integer.
    * @param k the frequency of numbers the caller is interested in finding in the 'numbers' argument.
    */ 

    public static List<Integer> findFrequentNumbers(List<Integer> numbers, int k){
        /* - make an output array / list
    - make hashmap Key: number Value: frequency : hashmap has unique keys

    - for each array element x in numbers

        if x in hashmap keys:
            key.value + 1
        
        else:
            add to hashmap with value 1 
             -now return keys where value = k
    for each key:
        if hashmap.containsvalue(k):
            output.add(key)

    return output
    */
        List<Integer> output = new ArrayList<Integer>();

        HashMap<Integer, Integer> frequencyHashMap = new HashMap<Integer, Integer>();

        // Create a hashmap of keys and values where the key is the number and the value is the frequency
        for (Integer x : numbers) {
            //if the key exists, get the value and add one to it
            if (frequencyHashMap.containsKey(x)) {
                frequencyHashMap.put(x, frequencyHashMap.get(x) + 1);
            //else set the key, and list value as 1
            } else {
                frequencyHashMap.put(x, 1);
            }
        }

        //Use this hashmap to output the correct keys
        // if frequency or value = k, add key to output array 
        for (Integer key : frequencyHashMap.keySet()) {
            if (frequencyHashMap.get(key) == k) {
                output.add(key);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6,1,1,6,6,6,3,4);

        Arrays.asList(1,2,3,4).forEach((k)-> {
            System.out.println(findFrequentNumbers(numbers, k));
        });
    }
}
