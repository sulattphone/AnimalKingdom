public class Bat extends Mammal implements Winged
{
   private final String animal = "Bat";
   
   public Bat(String name)
   {
      super(name);
   }
   public String toString()
   {
      String s= super.toString();
      s = "Animal name: "+ getName()+" " + (isWarmBlooded() ? "Warm Blooded" : "Cold Blooded")+ " "+ getType()+" "+animal;
      return s;
   }

   
   public boolean flies()
   {
      return canFly;
   }
}