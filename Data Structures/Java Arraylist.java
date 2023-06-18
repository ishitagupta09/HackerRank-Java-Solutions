import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        List<List<Integer>> listOfList= new ArrayList<>(); 
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=0;i<n;i++){
            int d=sc.nextInt();
            List<Integer> list= new ArrayList<>();
            for (int j=0; j<d; j++){
                list.add(sc.nextInt());
            }
            listOfList.add(list);
        }
        int q=sc.nextInt();
        for (int i=0;i<q;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            try{
                System.out.println(listOfList.get(x-1).get(y-1));
            }catch(Exception ex){
                System.out.println("ERROR!");
            }
        }
        
    }
}
