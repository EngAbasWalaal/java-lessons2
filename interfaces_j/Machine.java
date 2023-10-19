public class Machine implements Info{
    private int id=7;
    public void started(){
        System.out.println("Machine started");
    }
    public void showInfo(){
        System.out.println("Machine ID: " + id);
    }
}