import java.util.*;
import java.io.*;
class Solution{
	public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int contacts=sc.nextInt();
        sc.nextLine();
        Map<String, Integer> map=new HashMap<> (contacts);
        for (int i=0;i<contacts;i++){
            String name = sc.nextLine().trim();
            int phone=sc.nextInt();
            sc.nextLine();
            map.put(name,phone);
        }
    while(sc.hasNext()){
        String query = sc.nextLine().trim();
        if (map.containsKey(query)){
            System.out.println(query+"="+ map.get(query));
        }
        else{
            System.out.println("Not found");
        }
    }
        
      sc.close()  ;
	}
}
