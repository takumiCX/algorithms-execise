package com.takumicx.pat.advance;

public class Main1042 {

	static int[] order = new int[55];

	static String[] card = new String[55];

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);
		int time = Reader.nextInt();
		for (int i = 1; i <= 54; i++) {
			order[i] = Reader.nextInt();
		}

		initCard();

		for (int i = 0; i < time; i++) {
			shuffle();
		}

		StringBuffer buffer = new StringBuffer();
		for (int i = 1; i <= 54; i++) {
			buffer.append(card[i]).append(" ");
		}
		System.out.println(buffer.toString().trim());

	}

	private static void shuffle() {
		// TODO Auto-generated method stub
		String[] newCard = new String[55];
		for (int i = 1; i <= 54; i++) {
			newCard[order[i]] = card[i];
		}
		card = newCard;

	}

	private static void initCard() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 52; i++) {
			if (i <= 13) {
				card[i] = "S" + i;
			} else if (i <= 26) {
				card[i] = "H" + (i - 13);
			} else if (i <= 39) {
				card[i] = "C" + (i - 26);
			} else if (i <= 52) {
				card[i] = "D" + (i - 39);
			}
		}
		card[53] = "J1";
		card[54] = "J2";

	}

}
