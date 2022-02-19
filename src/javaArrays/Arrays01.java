package javaArrays;

import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v1[] = new int[9];
        int v2[] = new int[9];
        int vr[] = new int[9];

        int i;

        for (i = 0; i < v1.length; i++) {
            v1[i] = sc.nextInt();
        }
        for (i = 0; i < v2.length; i++) {
            v2[i] = sc.nextInt();
        }
        for (i = 0; i < vr.length; i++) {
            vr[i] = v1[i] * v2[i];
        }
        for (i = 0; i < vr.length; i++) {
            System.out.println(v1[i] + " * " +v2[i] + " = " + vr[i]);
        }


        sc.close();
    }
}
