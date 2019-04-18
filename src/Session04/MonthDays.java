package Session04;

public class MonthDays {
	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++) {
			System.out.println(i + ": " + getDaysForMonth(i));
		}
	}

	private static int getDaysForMonth(int month) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			return 31;

		case 2:
			return 28;

		case 4:
		case 6:
		case 8:
		case 10:
		case 12:
			return 30;

		}
		return 0;

	}

}
