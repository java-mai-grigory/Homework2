package ru.mai.junior.ObjectLib;

public interface ISubmergeable {
	final public static int MaxDepth = 9000;
	
	public void dive(int depth);
	public void surface(int depth);
}
