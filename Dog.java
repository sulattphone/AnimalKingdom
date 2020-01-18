public class Dog extends Mammal implements Adoptable
{
   private final String animal = "Dog";
   private String instructions;
   
   public Dog(String name)
   {
      super(name);
      instructions = "Take for walks, feed, throw ball, give lots of love.";
   }
   
   public String toString()
   {
      String s= super.toString();
      s = "Animal name: "+ getName()+" " + (isWarmBlooded() ? "Warm Blooded" : "Cold Blooded")+ " "+ getType()+" "+animal;
      return s;
   }

   
   public String getHomeCareInstructions()
   {
      return instructions;
   }
}