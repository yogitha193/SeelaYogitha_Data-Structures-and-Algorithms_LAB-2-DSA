package problem2.service;

public class PaymentApproach {

	public void denomination(int size, int curr_value[], int amount) {

		int[] count_of_denomination = new int[size];
		for (int i = 0; i < size; i++) {
			count_of_denomination[i] = 0;
		}

		try {
			for (int i = 0; i < size; i++) {
				if (amount == 0) {
					break;
				}
				int count = amount / curr_value[i];
				count_of_denomination[i] = count;
				amount = amount % curr_value[i];
			}
			if (amount > 0) {
				System.out.println("Payment approach not possible");
				return;
			}

			System.out.println();

			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int i = 0; i < size; i++) {
				if (count_of_denomination[i] == 0) {
					continue;
				}
				System.out.println(curr_value[i] + ":" + count_of_denomination[i]);
			}
		} catch (ArithmeticException e) {
			System.out.println("notes of denomination 0 is invalid");
		}

	}

}
