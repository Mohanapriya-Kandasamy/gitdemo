package org.gitdemo;

public class Git {
	public static void main(String[] args) {
		System.out.println("even numbers are:");
		int evencount = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {

				System.out.println(i);
				evencount++;

			}

		}
		System.out.println("evencount:" + evencount);

		System.out.println("odd numbers are:");
		int oddcount = 0;
		for (int j = 0; j <= 20; j++) {

			if (j % 2 != 0) {
				System.out.println(j);
				oddcount++;
			}

		}
		System.out.println("oddcount:" + oddcount);

	}


}
