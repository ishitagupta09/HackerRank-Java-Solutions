import java.io.*;
import java.util.*;
public class Solution {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        List<BitSet> bitSetList = List.of(b1, b2);
        for (int i = 0; i < m; i++) {
            sc.nextLine();
            String operation = sc.next();
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int set = n1-1;
            int set2 = n2-1;     
            if (operation.matches("AND")) {
                bitSetList.get(set).and(bitSetList.get(set2));
            } else if (operation.matches("OR")) {
                bitSetList.get(set).or(bitSetList.get(set2));
            } else if (operation.matches("XOR")) {
                bitSetList.get(set).xor(bitSetList.get(set2));
            } else if (operation.matches("FLIP")) {
                bitSetList.get(set).flip(n2);
            } else if (operation.matches("SET")) {
                bitSetList.get(set).set(n2);
            }
            System.out.printf("%s %s\n", b1.cardinality(), b2.cardinality());
        }
    }
}
