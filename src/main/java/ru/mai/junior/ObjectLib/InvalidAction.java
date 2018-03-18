package ru.mai.junior.ObjectLib;

public class InvalidAction extends RuntimeException{
	
	public InvalidAction()
	{
		super();
	}

	public String getMessage()
	{
		return "Invalid shape";
	}

	public String toString()
	{
		return "Опасное действие";
	}
}
