/*FindKthDistinctString */
/*You are given a collection of N strings, which may contain duplicates. Your task is to find the k-th unique (distinct) string in the order they first appear in the input. If the total number of unique strings available is less than k, you should indicate this by displaying -1.

Input:

An integer N representing the total number of strings.

N lines, each containing a string.

An integer k representing the desired position of the unique string.

Output:

The k-th distinct string.

-1 if there are fewer than k unique strings.

Constraints:

1 <= N <= 10^3

1 <= String.length() <= 10^3

Example:

Input:

6
d
b
c
b
c
a
2

Output:

a

(Explanation: The unique strings are "d" and "a". "d" is the 1st unique, "a" is the 2nd unique. Since k=2, "a" is returned.) */
import java.util.*;
public class Find_Kth_Distinct_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();// consume nextLine

        Map<String, Integer> freq = new HashMap<>();
        List<String> order = new ArrayList<>();

        // Read n strings & frequencies

        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            if(!freq.containsKey(s)){
                order.add(s); // store order of the first occurrences
            }
            freq.put(s, freq.getOrDefault(s, 0)+1);
        }
        int k = sc.nextInt();
        sc.close();
        //find the Kth unique strings
        int count  = 0;
        for(String word : order){
            if(freq.get(word) == 1){
                count++;
                if(count == k){
                    System.out.println(word);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
