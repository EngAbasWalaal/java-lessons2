class Students{
    public void grade1(int subjects, String math, String english, String handWriting, String term){
        System.out.println(subjects);
        System.out.println(math);
        System.out.println(english);
        System.out.println(handWriting);
        System.out.println(term);
    }
}

class App2{
    public static void main(String[] args){
        Students gradeOne=new Students();
        gradeOne.grade1(6, "mathematics", "english", "handWriting", "six terms");

        
    }
}