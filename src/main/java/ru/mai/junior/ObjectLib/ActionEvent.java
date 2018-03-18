package ru.mai.junior.ObjectLib;

public class ActionEvent {
	private Object source;

	public Object getSource() {
		return source;
	}

	public void setSource(Object source) {
		this.source = source;
	}

	public ActionEvent(Object source) {
		super();
		this.source = source;
	}
	
	
}
