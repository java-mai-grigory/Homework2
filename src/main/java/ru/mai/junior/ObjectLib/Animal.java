package ru.mai.junior.ObjectLib;

public class Animal extends AbstractAnimal {

	@Override
	void sleep() {
		System.out.println("Я сплю");
	}

	@Override
	void eat() {
		System.out.println("Я ем");

	}

}
