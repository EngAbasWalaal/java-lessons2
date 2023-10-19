public class Polymorphism_in_java{
    public static  void main(String[] args){
        Plant1 plant1=new Plant1();
        Tree1 tree1=new Tree1();

        // Plant plant2=plant1;

        Plant1 plant2=tree1;

        plant2.grow();

    }
}