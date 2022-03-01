package edu.jbegin.oop.printer;

public class InkPrinter implements Printer {

	private String text;
	private int curentPaintVolume;
	private int addVolume;

	public InkPrinter() {
	}

	public InkPrinter(int curentPaintVolume, int addVolume) {
		this.curentPaintVolume = curentPaintVolume;
		this.addVolume = addVolume;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getCurentPaintVolume() {
		return curentPaintVolume;
	}

	public void setCurentPaintVolume(int curentPaintVolume) {
		this.curentPaintVolume = curentPaintVolume;
	}

	public int getAddVolume() {
		return addVolume;
	}

	public void setAddVolume(int addVolume) {
		this.addVolume = addVolume;
	}

	@Override
	public void print(String text) {
		int diffVolume = 0;
		while (text.length() > curentPaintVolume) {
			diffVolume = text.length() - curentPaintVolume;

			System.out.println("На печать отправлен текст: " + text + ", длина: " + text.length() + "\n"
					+ "Не хватило краски: " + diffVolume + " (всего краски в принтере: " + curentPaintVolume + ")");
			charge();
		}
		curentPaintVolume -= text.length();
		System.out.println("На печать отправлен текст: " + text + ", длина: " + text.length() + "\n"
				+ "Текст распечатан: " + text + ", у принтера осталось краски: " + curentPaintVolume);
	}

	@Override
	public void charge() {
		curentPaintVolume += addVolume;
	}
}
