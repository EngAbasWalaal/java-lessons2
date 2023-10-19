class Machine{
    public void start(){
        System.out.println("start machine ... ");
    }
}
public class Anonamas_class{
    public static void main(String[] args){
        Machine machine1=new Machine(){
            @Override public void start(){
               System.out.println("camera is snapping ... ");
            }
        };
  machine1.start();
}
    }
 