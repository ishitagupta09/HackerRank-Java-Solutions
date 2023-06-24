import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i=0;i<N;i++){
            int value=sc.nextInt();
            list.add(value);
        }
        int Q=sc.nextInt();
        for (int i=0;i<Q;i++){
            String query =sc.next();
            if (query.equals("Insert")){
                int x=sc.nextInt();
                int y=sc.nextInt();
                list.add(x,y);
            }
            else{
                int x=sc.nextInt();
                list.remove(x);
            }
        }
        sc.close();
        for (Integer num : list) {
            System.out.print(num + " ");
        } 
    }
}
