package com.projj1;

public class mainclass {
    public static void main(String[] args) {
        int size = 10;
        int l = 1;
        int sp = size;
        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = sp; j > 0; j--) {
                sb.append(' ');
            }
            for (int k = 0; k < l; k++) {
                sb.append('*');
            }
            sp--;
            l += 2;
            System.out.println(sb.toString());
        }

    }
}
