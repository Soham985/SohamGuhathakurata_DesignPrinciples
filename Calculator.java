import java.util.*;
class Calculator
{
    double a,b;
    Calculator(double a, double b)
    {
        this.a=a;
        this.b=b;
    }
    public void Add()
    {
        System.out.println( a+" + "+b+" = "+(a+b));
    }
    public void Subtract()
    {
        System.out.println(a+" - "+b+" = "+(a-b));
    }
    public void Multiply()
    {
        System.out.println(a+" * "+b+" = "+(a*b));
    }
    public void Divide()
    {
        if(b==0)
            System.out.println("Division by ) is not possible");
        else
            System.out.println(+a+" / "+b+" = "+(a/b));
    }
}
class ABC
{
    public static void main(String arg[])
    {
        System.out.print("Enter two numbers:");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        Calculator cal=new Calculator(a,b);
        System.out.println("Press 1 to add\nPress 2 to subtract\nPress 3 to multiply\nPress 4 to divide");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                cal.Add();;
                break;
            case 2:
                cal.Subtract();;
                break;
            case 3:
                cal.Multiply();;
                break;
            case 4:
                cal.Divide();
                break;
            default:
                System.out.print("INVALID INPUT");
        }
    }
}