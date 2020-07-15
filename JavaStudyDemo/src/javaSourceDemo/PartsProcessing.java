package javaSourceDemo;

public class PartsProcessing {
	public static void main(String[] args) {
		/*
		 * 甲乙丙丁一共加工零件370个，如果把甲的个数+10，乙的个数-20，丙的个数x2 丁做的个数÷2，那么四人做的数量相等。求四人各做多少个
		 */
		for (int i = 1; i < 367; i++) {
			for (int j = 1; j < 367; j++) {
				for (int k = 1; k < 367; k++) {
					int d = 370 - i - j - k;
					if (i + j + k + d == 370 && i + 10 == j - 20 && j - 20 == k * 2 && k * 2 == d / 2) {
						System.out.printf("四人的数量分别为：\t%d\t%d\t%d\t%d\n", i, j, k, d);
					}
				}
			}
		}
	}
}
