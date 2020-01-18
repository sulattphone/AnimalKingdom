public abstract class Whale extends Mammal implements WaterDweller
{
   private final String animal = "Whale";
   private boolean livesOnLand;
   
   public Whale(String name)
   {
      super(name);
      livesOnLand = false;
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