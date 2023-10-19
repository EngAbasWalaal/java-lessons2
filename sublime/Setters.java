class Students{
	private String name;
	private String classRoom;
	private int age;


	public void setName(String name){
		this.name=name;
	}
	public void setClassRoom(String classRoom){
		this.classRoom=classRoom;
	}

	public void setAge(int age){
		this.age=age;
	}

	public String getName(){
		return name;
	}
	public String getClassRoom(){
		return classRoom;
	}

	public int getAge(){
		return age;
	}

}

 public class Setters{
	public static void main(String[] args){
		Students std1=new Students();

		System.out.println("Student 1");
        System.out.println("---------------------------");
		std1.setName("Anas");
		std1.setClassRoom("grade one");
		std1.setAge(3);

		System.out.println(std1.getName());
		System.out.println(std1.getClassRoom());
		System.out.println(std1.getAge());

	System.out.println("***");

	 Students std2=new Students();

	 System.out.println("Student 2");
	 System.out.println("---------------------------");
	 std2.setName("Halima");
	 std2.setClassRoom("grade 2");
	 std2.setAge(12);

	 System.out.println(std2.getName());
	 System.out.println(std2.getClassRoom());
	 System.out.println(std2.getAge());

	System.out.println("***");
	 Students std3=new Students();
	 System.out.println("Student 3");
	 System.out.println("---------------------------");
	 std3.setName("Amran");
	 std3.setClassRoom("grade 5");
	 std3.setAge(7);
     
     System.out.println(std3.getName());
     System.out.println(std3.getClassRoom());
     System.out.println(std3.getAge());
	}
}
