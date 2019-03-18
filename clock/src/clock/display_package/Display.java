package clock.display_package;

public class Display {
	private int value = 0;
	private int upperLimit = 0;

	public Display(int upperLimit) {
		super();
		this.upperLimit = upperLimit;
	}

	public void tick() {
		value++;
		if (value == upperLimit) {
			value = 0;
		}
	}

	public String toString() {
		if (value < 10) {
			return "0" + value;
		} else {
			return "" + value;
		}
	}

	public int getValue() {
		return value;
	}

}
