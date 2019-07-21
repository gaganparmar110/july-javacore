package ArithmeticOperation;

public class methodOverloading {
    int add(int num1, int num2)
    {
        return num1+num2;
    }
    int add(int num1, int num2, int num3)
    {
        return num1+num2+num3;
    }
    int add(int num1, int num2, int num3, int num4)
    {
        return num1+num2+num3+num4;
    }
    public static void main(String[] args) {
           methodOverloading ob=new methodOverloading();
           System.out.println("sum of 2 number is: "+ob.add(23,2));
           System.out.println("sum of 2 number is: "+ob.add(23,2,5));
           System.out.println("sum of 2 number is: "+ob.add(23,2,15));
    }
}
