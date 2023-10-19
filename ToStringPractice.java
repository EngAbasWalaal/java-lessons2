class Cats{
    private int id;
    private String name;

    public Cats(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Cats{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

 public class ToStringPractice{
    public static void main(String[] args) {
        Cats cat = new Cats(1, "Tom");
        Cats cat2 = new Cats(2, "Kiddy");
        System.out.println(cat);
        System.out.println(cat2);
    }   
}