package ru.mai.junior.ObjectLib;

public class ActionListener implements IListen {

	public void actionPerformed(ActionEvent e) {
		String Name = "";
		if (e.getSource() instanceof PetDog )
			Name = ((PetDog)e.getSource()).getName();
		System.out.println("Собака " + Name + " выполняет команду");
	}

}
