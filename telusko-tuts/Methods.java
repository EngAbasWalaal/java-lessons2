class Computer{
    public void playMusic(){
        System.out.println("music playing ... ");
    }

    public String getMePen(int cost){
        return "pen";
    }
}
public class Methods {
    public static void main(String[] args) {
        Computer obj=new Computer();
        obj.playMusic();
        String str=obj.getMePen(20);
        System.out.println(str);
    }
}
