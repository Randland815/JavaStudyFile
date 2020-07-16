package javaSourceDemo;

public class ShuffleCardsDemo {
	public static void main(String[] args) {
		final int N = 52;// һ��52����
		int[] cards = new int[N];
		String[] cardColor = { "����", "����", "����", "÷��" };// �ƵĻ�ɫ����
		String[] cardValue = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i;// ������ѭ��������ֵһ�£�0-51֮��
		}
		System.out.println("ϴ��ǰ");
		for (int i = 0; i < cards.length; i++) {
			System.out.printf("%s-%s", cardColor[cards[i] / 13], cardValue[cards[i] % 13]);
			if ((i + 1) % 13 == 0) {
				System.out.println();
			} else {
				System.out.print(" ");
			}
		}
		// ϴ�ƣ��������һ��0-51֮�������newIndex��cards[i]��cards[newIndex]��Ԫ�ػ���
		for (int i = 0; i < cards.length; i++) {
			int newIndex = (int) (Math.random() * N); // 0-51֮�������
			int temp = cards[i];
			cards[i] = cards[newIndex];
			cards[newIndex] = temp;
		}
		System.out.println();
		System.out.println("ϴ�ƺ�");
		for (int i = 0; i < cards.length; i++) {
			System.out.printf("%s-%s", cardColor[cards[i] / 13], cardValue[cards[i] % 13]);
			if ((i + 1) % 13 == 0) {
				System.out.println();
			} else {
				System.out.print(" ");
			}
		}
	}
}