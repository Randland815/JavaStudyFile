package javaSourceDemo;

public class OddAndEvenNums {
	public static void main(String[] args) {
		// �������һ�����飬��������ż���ֱ��ж��ٸ�
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int) (Math.random() * 10000)) % 1001;
		}
		// ����ż������
		// 1.��������
		int oddNums = 0, evenNums = 0;
		// 2.��2�ı�����evenNums++����֮��oddNums++
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				evenNums++;
			} else {
				oddNums++;
			}
		}
		System.out.printf("��������%d��������%d��ż��", oddNums, evenNums);
	}
}
