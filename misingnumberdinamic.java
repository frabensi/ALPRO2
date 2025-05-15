package com.mycompany.missingnumberdinamis;

import java.util.Scanner;

public class Missingnumberdinamis {

    public static int findMissingNumber(int[] nums, int n) {
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang deret angka (n): ");
        int n = scanner.nextInt();

        int[] nums = new int[n - 1];

        System.out.println("Masukkan angka-angka dalam deret, kecuali yang hilang:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }

        int missingNumber = findMissingNumber(nums, n);
        System.out.println("Angka yang hilang adalah: " + missingNumber);
    }
}
