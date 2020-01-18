import java.util.*;

public class AnimalKingdomDriver {
	public static void main(String[] args) {
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(new Bat("Count Batula"));
		animalList.add(new BlueWhale("Blubby Blubs"));
		animalList.add(new Dog("Mr. Wooferson"));
		animalList.add(new Emu("Outback Ollie"));
		animalList.add(new Goldfish("Sammy Swimmer"));
		animalList.add(new Otter("Henry Handholder"));
		animalList.add(new Parakeet("Songbird Stu"));
		animalList.add(new Turtle("Shelly Silversteen"));
		
		System.out.println("***** Here are all the animals.");
		for(Animal animal : animalList) {
			System.out.println(animal.toString());
		}
		
		System.out.println("\n\n***** Here are just the mammals.");
		for(Animal animal : animalList) {
			if(animal instanceof Mammal)
         {
            Mammal mammalAnimal = (Mammal) animal;
            
            System.out.println(mammalAnimal.toString());
         }
		}
		
		System.out.println("\n\n***** Here are the winged animals along with information about whether they can fly.");
		for(Animal animal : animalList) {
			if(animal instanceof Winged)
         {
            Winged wingedAnimal = (Winged) animal;
            
            System.out.println(wingedAnimal.toString());
            System.out.println((wingedAnimal.flies() ? "Can Fly": "Cannot Fly"));
         }
		}
		
		System.out.println("\n\n***** Here are the adoptable animals along with their care instructions.");
		for(Animal animal : animalList) {
			if(animal instanceof Adoptable)
         {
            Adoptable adoptableAnimal = (Adoptable) animal;
            
            System.out.println(adoptableAnimal.toString());
            System.out.println(adoptableAnimal.getHomeCareInstructions());
         }
		}
	
		
		System.out.println("\n\n***** Here are the animals that can dwell in water, along with whether they can also live on land.");
		for(Animal animal : animalList) {
			if(animal instanceof WaterDweller)
         {
            WaterDweller waterAnimal = (WaterDweller) animal;
            
            System.out.println(waterAnimal.toString());
            System.out.println((waterAnimal.livesOnLand() ? "Lives on Land" : "Does not live on land."));
         }
		}
		

		
	
	}
}