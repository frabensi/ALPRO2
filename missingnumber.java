package com.mycompany.misingnumber;

public class Misingnumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;

        int[] b = new int[arr[n - 1] + 1];

        for (int i = 0; i < n; i++) {
            b[arr[i]] = 1;
        }

        for (int i = 1; i <= arr[n - 1]; i++) {
            if (b[i] == 0) {
                System.out.println("Angka yang hilang: " + i);
            }
        }
    }
}
