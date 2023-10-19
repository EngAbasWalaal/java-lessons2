class  Ourcar{
    //class variables, also known as fields
    String brand;
    String model;
    int year;

    //constructor to initialize objects
    public Ourcar(String brand, String model, int year){
      this.brand=brand;
      this.model=model;
      this.year=year;
    }

    //method to display car information
    public void display(){
        System.out.println("brand: "+brand);
        System.out.println("model: "+model);
        System.out.println("year: "+year);
    }
}
public class Fam_with_classes{
    public static void main(String[] args){
        // Create instances (objects) of the Car class
      Ourcar car1=new Ourcar("BMW", "M3", 2019);
      Ourcar car2=new Ourcar("Toyota", "M6", 2020);
      Ourcar car3=new Ourcar("Nissan", "M10", 2021);
      Ourcar car4=new Ourcar("Suzuki", "M12", 2023);
      
      // Call methods on objects
      car1.display();
      car2.display();
      car3.display();
      car4.display();
    }
}