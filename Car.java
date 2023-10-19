public class Car extends Machine{

    public void start(){
        System.out.println("Starting car...");
    }

    public void stop(){
        System.out.println("Stopping car...");
    }
  public void wipe() {
   System.out.println("Wiping window shielding...");
  }
  public void showInfo() {
     System.out.println("Getting info..."+name+"...");
  }
}