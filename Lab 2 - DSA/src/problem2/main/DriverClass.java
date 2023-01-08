package problem2.main;

import java.util.*;

import problem2.service.PaymentApproach;
import problem2.service.PaymentMergeSort;

public class DriverClass {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of currency denominations");
		int size = sc.nextInt();
		System.out.println("enter the currency denominations value");
		int[] curr_value = new int[size];
		for (int i = 0; i < size; i++) {
			curr_value[i] = sc.nextInt();
		}

		PaymentMergeSort mergesort = new PaymentMergeSort();
		mergesort.sort(curr_value, 0, size - 1);

		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();

		System.out.println();

		PaymentApproach paymentApproach = new PaymentApproach();

		paymentApproach.denomination(size, curr_value, amount);

	}
}
