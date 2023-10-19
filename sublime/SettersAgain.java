class Casheirs{
	private String name;
	private String dept;
	private String shift;
	private boolean isAbsent;
	private String day;

	public void setName(String name){
		this.name=name;
	}
	public void setDept(String dept){
		this.dept=dept;
	}
	public void setShift(String shift){
		this.shift=shift;
	}
	public void setPresent(boolean isAbsent){
		this.isAbsent=isAbsent;
	}
	public void setDay(String day){
		this.day=day;
	}

	public String getName(){
		return name;
	}
	public String getDept(){
		return dept;
	}
	public String getShift(){
		return shift;
	}
	public boolean getPresent(){
		return isAbsent;
	}
	public String getDay(){
		return day;
	}
}
public class SettersAgain{
	public static void main(String[] args){
		Casheirs cashier1=new Casheirs();

		cashier1.setName("Abdirahman Mumin");
		cashier1.setDept("Main Cashiers");
		cashier1.setShift("Day");
		cashier1.setPresent(true);
		cashier1.setDay("Saturday");

		System.out.println("Cashier 1");
		System.out.println("**********************");

		System.out.println("I am "+cashier1.getName()+" my deprtment is "+cashier1.getDept()+" and today is "+cashier1.getDay());

		Casheirs cashier2=new Casheirs();
		cashier2.setName("Abbas Walaal");
		cashier2.setDept("Pharmacy Cashiers");
		cashier2.setShift("Night");
		cashier2.setPresent(false);
		cashier2.setDay("Sunday");

		System.out.println("**********************");
		System.out.println("Cashier 2");
		System.out.println("**********************");
		System.out.println("I am "+cashier2.getName()+" my deprtment is "+cashier2.getDept()+" and today is "+cashier2.getDay());


	}
}