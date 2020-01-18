public class BlueWhale extends Whale
{

   private final String animalType = "BlueWhale";
   public BlueWhale(String name)
   {
      super(name);
   }
   
   public String toString()
   {

      String s = super.toString() + " "+ animalType;
      return s;
   }

}