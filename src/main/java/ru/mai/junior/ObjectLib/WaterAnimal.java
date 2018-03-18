package ru.mai.junior.ObjectLib;

public class WaterAnimal implements ISubmergeable{

	int CurrentDepth  = 0;
	int MaxDepth = MAXD;
	
	public void dive(int depth) {
		if (CurrentDepth + depth < MaxDepth)
			CurrentDepth += depth;
		else 
			throw new InvalidAction();
	}

	public void surface(int depth) {
		CurrentDepth -= depth;
	}

	public int getMaxDepth() {
		return MaxDepth;
	}

	public void setMaxDepth(int maxDepth) {
		MaxDepth = maxDepth;
	}

	public void surface() {
		// TODO Auto-generated method stub
	}

	
	

}
