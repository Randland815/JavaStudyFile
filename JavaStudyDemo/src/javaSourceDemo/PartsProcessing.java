package javaSourceDemo;

public class PartsProcessing {
	public static void main(String[] args) {
		/*
		 * ���ұ���һ���ӹ����370��������Ѽ׵ĸ���+10���ҵĸ���-20�����ĸ���x2 �����ĸ�����2����ô��������������ȡ������˸������ٸ�
		 */
		for (int i = 1; i < 367; i++) {
			for (int j = 1; j < 367; j++) {
				for (int k = 1; k < 367; k++) {
					int d = 370 - i - j - k;
					if (i + j + k + d == 370 && i + 10 == j - 20 && j - 20 == k * 2 && k * 2 == d / 2) {
						System.out.printf("���˵������ֱ�Ϊ��\t%d\t%d\t%d\t%d\n", i, j, k, d);
					}
				}
			}
		}
	}
}
