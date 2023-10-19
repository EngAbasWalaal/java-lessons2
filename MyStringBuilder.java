public class MyStringBuilder{
    public static void main(String[] args) {
        //create string builder object
        StringBuilder myString=new StringBuilder();
        myString.append("Hello");
        myString.append("world");
        
        //insert a string of specific position
        myString.insert(5, "Java ");
        myString.insert(5, " ");

        //replace a postion of a string
        myString.replace(0, 5, "greetings from ");

        String finalString=myString.toString();
        System.out.println(finalString);


    }
}