public class Plant{
    public static final int ID=7;
    private String name;

    public String getData(){
      String data="some stuff "+calculateGrowth();
      return data;
    }
    private int calculateGrowth(){
        return 9;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
public class Encapsulation_in_java{
    public static void main(String[] args) {
    }

}