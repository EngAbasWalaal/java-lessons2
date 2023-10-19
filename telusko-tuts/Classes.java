class Calculator{
    int a;
    public int add(int n1, int n2){
       int r=n1+n2;
       return r;
    }
}
class Classes{
    public static void main(String[] args) {
     

        Calculator calc=new Calculator();
        

        int result=calc.add(4, 5);
        int result2=calc.add(6, 15);
        int result3=calc.add(24, 55);
         System.out.println(result);
         System.out.println(result2);
         System.out.println(result3);
    }
}