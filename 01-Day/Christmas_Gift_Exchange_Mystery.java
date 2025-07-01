import java.util.*;
public class Christmas_Gift_Exchange_Mystery {

    public static void find_youngest_member(int n, int m, int[][] gifts){
        int count[] = new int[n+1];

        for(int i = 0; i < m; i++){
            count[gifts[i][1]]++;
        }
        int young = -1;
    
        for(int i = 0; i < count.length; i++){
            if(count[i] == n-1){
                young = i;
            }

        }
        System.out.println(young);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
         int[][] gifts = new int[m][2];
        for(int i = 0; i < m; i++){
            gifts[i][0] = sc.nextInt();
            gifts[i][1] = sc.nextInt();
        }
        find_youngest_member(n, m, gifts);
        sc.close();
    }
}
