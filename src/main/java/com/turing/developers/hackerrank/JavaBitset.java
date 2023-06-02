package com.turing.developers.hackerrank;

import java.util.*;

public class JavaBitset {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
    
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
    
        int m = in.nextInt();

        for (int i = 0; i < m; i++) {
            String operation = in.next();
            int op1 = in.nextInt();
            int op2 = in.nextInt();
    
            switch (operation) {
                case "AND":
                    if (op1 == 1) {
                        b1.and(b2);
                    }else{
                        b2.and(b1);
                    }
                    break;
                case "OR":
                    if (op1 == 1) {
                        b1.or(b2);
                    }else{
                        b2.or(b1);
                    }
                    break;
                case "XOR":
                    if (op1 == 1) {
                        b1.xor(b2);
                    }else{
                        b2.xor(b1);
                    }
                    break;
                case "SET":
                    if (op1 == 1) {
                        b1.set(op2);
                    }else{
                        b2.set(op2);
                    }
                    break;
                case "FLIP":
                    if (op1 == 1) {
                        b1.flip(op2);
                    }else{
                        b2.flip(op2);
                    }
                    break;
            }
            System.out.println(b1.cardinality()+" "+b2.cardinality());
        }
    }
}
