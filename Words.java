import java.util.Scanner;
public class Words{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a sentence or words");
        String sentence=input.nextLine();

        //replace 'slave word' with worker
        String word=sentence.replaceAll("\\bslave", "worker");

        System.out.println(word);

    }
}