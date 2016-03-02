// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;
		String Weekday = JOptionPane.showInputDialog(null, "is it a weekday?");
		if (Weekday.equalsIgnoreCase("yes")) {
			String Vacation = JOptionPane.showInputDialog("Is it a vacation week?");
			if (Vacation.equalsIgnoreCase("Yes")) {
				System.out.println("Sleep in");
			}else {
				System.out.println("Get up lazybones!");
			}
		}else  {
			System.out.println("Sleep in");
		}

	}
}
