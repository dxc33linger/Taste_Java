package clock;

import clock.display_package.Display;

public class Clock {
	private static Display hour = new Display(24);
	private static Display minute = new Display(60);

	public void tick() {
		minute.tick();
		if (minute.getValue() == 0) {
			hour.tick();
		}
	}

	public void show() {
		// How to use System.out.printf		
		System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
		
		// Automatically call toString()
		/* The following line is as same as
		 System.out.println(hour.toString()+":"+minute.toString()); */
		System.out.println(hour + ":" + minute);
	}

	public static void main(String[] args) {

		Clock clk = new Clock();
		while (!(hour.getValue() == 23 && minute.getValue() == 59)) {
			clk.tick();
			clk.show();
		}
	}

}
