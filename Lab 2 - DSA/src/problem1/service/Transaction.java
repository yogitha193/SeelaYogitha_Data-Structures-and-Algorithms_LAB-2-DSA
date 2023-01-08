package problem1.service;

import java.util.Scanner;

public class Transaction {

	public void payMoney(int size, int tranc_arr[], int targets) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		while (targets != 0) {
			int flag = 0;
			System.out.println();
			System.out.println("enter the value of target");
			int value_of_target = sc.nextInt();
			targets--;

			for (int i = 0; i < size; i++) {
				sum = sum + tranc_arr[i];
				if (sum >= value_of_target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Given target is not achieved");
			}
		}
	}
}
