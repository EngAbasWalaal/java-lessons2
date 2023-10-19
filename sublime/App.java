class Robot{
	public void speak(String text){
		System.out.println(text);
	}
	public void jump(double height){
		System.out.println("Jump is "+height);
	}
	public void move(String direction, double distance, boolean isCompleted){
		System.out.println(" moving "+direction+" direction in the "+distance+", was completed? "+isCompleted);
	}
}
class App{
	public static void main(String[] args) {
		Robot sam=new Robot();
		sam.speak("Hi i am sam");
		sam.move("north",12.78, true);
	}
}