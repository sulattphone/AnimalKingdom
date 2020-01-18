public abstract class Fish extends Animal
{
   private final String type = "Fish";
   

   public Fish (String name)
   {
      super(name, false);
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