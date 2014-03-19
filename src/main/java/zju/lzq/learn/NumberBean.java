package zju.lzq.learn;

public class NumberBean {
	private int firstNumber;
	private int secondNumber;

	public NumberBean() {
		System.out.println("creating NumberBean");
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public int getResult() {
		System.out.println("getResult " + (firstNumber + secondNumber));
		return firstNumber + secondNumber;
	}
}
