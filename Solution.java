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
        
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6,1,1,6,6,6,3,4);

        Arrays.asList(1,2,3,4).forEach((k)-> {
            System.out.println(findFrequentNumbers(numbers, k));
        });
    }
}
