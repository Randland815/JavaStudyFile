package javaSourceDemo;

public class MaxAndMinValue {
	public static void main(String[] args) {
		// �������һ�����飬����������ֵ����Сֵ
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int) (Math.random() * 10000)) % 1001;
		}
		// �����ֵ��Сֵ
		// 1.�����һ��Ԫ�������ֵ/��Сֵ
		int max = nums[0];
		int min = nums[0];
		// 2.�����ֵ������Сֵ����������бȽϣ����ĳ��Ԫ�ر����ֵ��/����СֵС����������
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				// ��������е�ĳ��Ԫ�� > max����������
				max = nums[i];
			}
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println("����������Ԫ���ǣ�" + max);
		System.out.println("��������С��Ԫ���ǣ�" + min);
	}
}