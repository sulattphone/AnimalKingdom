public abstract class Animal
{
   private String name;
   private boolean isWarmBlooded;
   
   public Animal(String animalName, boolean warmOrNot)
   {
      name = animalName;
      isWarmBlooded = warmOrNot;
   }
   
   public boolean isWarmBlooded()
   {
      return isWarmBlooded;
   }
   
   public String getName()
   {
      return name;
   }
   
   public abstract String toString();
   
   public boolean equals(Object o)
   {
      if(o instanceof Animal)
      {
         Animal otherAnimal = (Animal) o;
         return (this.getName().equalsIgnoreCase(otherAnimal.getName()) && this.isWarmBlooded() == otherAnimal.isWarmBlooded());
      }
      return false;
   }
}