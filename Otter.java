public class Otter extends Mammal implements WaterDweller
{
   private final String animal = "Otter";
   private boolean livesOnLand;
   
   public Otter(String name)
   {
      super(name);
      livesOnLand = true;
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

}