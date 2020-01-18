public class Turtle extends Reptile implements WaterDweller, Adoptable
{
   private final String animal = "Turtle";
   private boolean livesOnLand;
   private String instructions;
   
   public Turtle(String name)
   {
      super(name);
      livesOnLand = true;
      instructions = "Feed, clean shell, and give lots of love.";
   }
   
   public String toString()
   {
      String s= super.toString();
      s = "Animal name: "+ getName()+" " + (isWarmBlooded() ? "Warm Blooded" : "Cold Blooded")+ " "+ getType()+" "+animal;
      return s;
   }
 
   
   public boolean livesOnLand()
   {
      return livesOnLand;
   }
   
   public String getHomeCareInstructions()
   {
      return instructions;
   }
}