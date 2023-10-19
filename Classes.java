class Students{
    String name;
    int age;
    
    void speak(){
        System.out.println(" Hello my name is "+name+", i am "+age+" years old");
    }
    void tasksTodo(){
        String[] days={"Saturday", "Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        if(days[0]=="Saturday"){
            System.out.println(" today is "+days[0]+" "+name+" you have to go to school");
        }
        
    }
    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

}
class Classes{
    public static void main(String[] args){
        Students std1=new Students(); 
        std1.name="Anas";
        std1.age=4;
        // std1.speak();
        std1.tasksTodo();
        
        String name=std1.getName();
        int age=std1.getAge();
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);

        //creating second objects
        Students std2=new Students();
        std2.name="Fadima Saleman";
        std2.age=20;
        System.out.println("-------------------------------");
        // std2.speak();
        // std2.tasksTodo();
       
       
    }
}