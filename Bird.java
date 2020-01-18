public abstract class Bird extends Animal
{
   private final String type = "Bird";

   

   public Bird (String name)
   {
      super(name, true);
   }
   
   public String toString()
   {
      return null;
   }
   
   public String getType ()
   {
      return type;
   }
}