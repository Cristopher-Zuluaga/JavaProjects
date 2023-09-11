public class dog 
  {
    String breed;
    boolean hasowner;
    int age;
    public dog(String dogbreed, boolean dogOwned, int dogYears) 
    {
      System.out.println("constructor invoked");
      breed = dogbreed;
      hasowner = dogOwned;
      age = dogYears;
    }
  public static void main(String[] args) 
    {
      System.out.println("main method invoked");
      dog fido = new dog("puddle", false, 4);
      dog munzio = new dog("Shiba inu", true, 12);
      boolean isFidoOlder = fido.age > munzio.age;
      int totalYearsOld = fido.age + munzio.age;
      System.out.println("two dogs are created: a " + fido.breed + "and a " + munzio.breed);
      System.out.println("the statement that fido is older is " + isFidoOlder);
      System.out.println("the total dog years is " + totalYearsOld);
      System.out.println("main method is finished");
    }
}
