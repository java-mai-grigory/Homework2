package ru.mai.junior.ObjectLib;

public class PetDog extends Dog{
	
	private String Name;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	private Object action = null;
	
	public void setAction(Object action)
	{
		this.action = action;
	}

	public PetDog(String name) {
		super();
		Name = name;
	}
	
	public void perform()
	{
		if ( action != null)
			((IListen)action).actionPerformed( new ActionEvent(this) );
	}
}
