public class Droid {
  int batterylevel;
  String name;
  public Droid(String droidName)
  {
    batterylevel = 100;
    name = droidName;
  }
  public String toString()
  {
    return "Hello, i'm te droid" + name;
  }
  public void performtask(String task)
  {
    System.out.println(name + "is performing" + task);
  }
  public void batteryLosing()
  {
    batterylevel -= 10;
  }
  public void batteryReport()
  {
    System.out.println(batterylevel);
  }
  public void batteryTransfer()
  {
    System.out.println(batterylevel);
  }
  public static void main(String[] args) 
  {
    Droid codey = new Droid("codey");
    System.out.println(codey.toString());
    codey.performtask("dancing");
    codey.batteryLosing();
    codey.batteryReport();
  }
}
