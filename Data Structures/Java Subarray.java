import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int n,sum=0, c=0;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0; i<n;i++){
            for (int j=i;j<n;j++){
                sum=0;
                for (int k=i;k<=j;k++){
                   sum+= arr[k]; 
                }
                if(sum<0) c++;
            }
        }
        System.out.println(c);
    }
}
