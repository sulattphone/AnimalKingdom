public abstract class Mammal extends Animal
{
   private final String type = "Mammal";


   public Mammal (String name)
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