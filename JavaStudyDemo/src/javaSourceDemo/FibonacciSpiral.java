package javaSourceDemo;

public class FibonacciSpiral {
	public static void main(String[] args) {
		int[] spiral = new int[15];
		spiral[0] = 0;
		spiral[1] = 1;
		for (int i = 2; i < spiral.length; i++) {
			// �ӵ�3����ʼ������ǰ����Ԫ��֮��
			spiral[i] = spiral[i - 1] + spiral[i - 2];
		}
		for (int i = 0; i < spiral.length; i++) {
			System.out.print(spiral[i] + " ");
		}
		System.out.println(); // ����
	}
}