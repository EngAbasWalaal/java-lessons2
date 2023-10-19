

class Employee{
    int id;
    String name;
    double Salary;

    public Employee(int id, String name, double Salary) {
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void SetName(String name) {
        this.name = name;
    }
    public void SetSalary(double Salary) {
        this.Salary = Salary;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return Salary;
    }


    public void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+Salary);
    }
}
public class Pr3classes{
    public static void main(String[] args) {
       
        Employee e1=new Employee(1,"John",75.5);
        Employee e2=new Employee(2,"ali",200.5);
        e1.display();
        e2.display();
       
    }
}