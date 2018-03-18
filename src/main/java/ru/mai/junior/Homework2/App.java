package ru.mai.junior.Homework2;

import ru.mai.junior.ObjectLib.AbstractAnimal;
import ru.mai.junior.ObjectLib.ActionListener;
import ru.mai.junior.ObjectLib.Animal;
import ru.mai.junior.ObjectLib.PetDog;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     //   Animal some_animal = new Animal();
      //  some_animal.setColor(AbstractAnimal.Color.Black);
        
        ActionListener action = new ActionListener();
        PetDog dog = new PetDog("Шарик");
        dog.setAction(action);
        dog.perform();
          		
        		
    }
}
