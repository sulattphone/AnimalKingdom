public abstract class Reptile extends Animal
{
   private final String type = "Reptile";
   

   public Reptile (String name)
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