public class Parakeet extends Bird implements Adoptable, Winged
{
   private final String animal = "Parakeet";
   private String instructions;
   public Parakeet(String name)
   {
      super(name);
      instructions = "Feed, talk to, give lots of love.";
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
   
   public boolean flies()
   {
      return canFly;
   }
      
}