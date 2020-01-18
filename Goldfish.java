public class Goldfish extends Fish implements Adoptable
{
   private final String animal = "Goldfish";
   private String instructions;
   
   public Goldfish(String name)
   {
      super(name);
      instructions = "Feed, change water, and give lots of love.";
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
