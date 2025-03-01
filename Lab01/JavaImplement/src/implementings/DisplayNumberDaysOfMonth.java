package implementings;

import java.util.*;

public class DisplayNumberDaysOfMonth {
	public static void main(String[] args) {
		HashMap<String, Integer> monthDays = new HashMap<String, Integer>();
		int iInputYear = -1, iInputMonth = -1;
		String buffer;
		String[][] monthNames = {
				{"January", "Jan.", "Jan", "1"}, {"February", "Feb.", "Feb", "2"},
	            {"March", "Mar.", "Mar", "3"}, {"April", "Apr.", "Apr", "4"},
	            {"May", "May", "May", "5"}, {"June", "Jun.", "Jun", "6"},
	            {"July", "Jul.", "Jul", "7"}, {"August", "Aug.", "Aug", "8"},
	            {"September", "Sep.", "Sep", "9"}, {"October", "Oct.", "Oct", "10"},
	            {"November", "Nov.", "Nov", "11"}, {"December", "Dec.", "Dec", "12"}
		};
		int[] dayOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i < 12; i++) {
			for (String names : monthNames[i]) {
				monthDays.put(names.toLowerCase(), i+1);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		while (iInputYear < 0) {
			System.out.print("Enter a year: ");
			if (sc.hasNextInt()) {
				iInputYear = sc.nextInt();
				if (iInputYear < 0) {
					System.out.println("Invalid year!");
				}
			}
			else {
				System.out.println("Invalid year!");
				sc.next();
			}
		}
		sc.nextLine();
		
		while(iInputMonth < 0) {
			System.out.print("Enter a month: ");
			buffer = sc.next().toLowerCase();
			if (monthDays.containsKey(buffer)) {
				iInputMonth = monthDays.get(buffer);
			}
			else {
				System.out.println("Invalid month!");
			}
		}
		int res = dayOfMonths[iInputMonth-1];
		if (iInputMonth == 2) {
			if ((iInputYear % 4 == 0 && iInputYear % 100 != 0) || (iInputYear % 400 == 0)) {
				res = 29;
			}
		}
		System.out.println(iInputMonth + "/" + iInputYear + " has " + res + " days");
		return;
	}
}
