public class Inheritance_in_java{
    public static void main(String[] args){
        Machine mac1 = new Machine();
        
        mac1.start();
        mac1.stop();

        System.out.println("================================================================");

        Car car1 = new Car();

        car1.start();
        car1.wipe();
        car1.showInfo();
        car1.stop();

         System.out.println("================================================================");

         Moto moto1 = new Moto();
         moto1.start();
      
         moto1.stop();
    }
}