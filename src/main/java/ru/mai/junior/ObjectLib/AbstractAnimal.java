package ru.mai.junior.ObjectLib;

public abstract class AbstractAnimal {
	static public  enum Color {Red, White, Black, Blue};
	
	double weight;
	Color color;
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	abstract void sleep();
	abstract void eat();
}
