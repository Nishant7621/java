import java.util.*;
 class A {
     int a,b;
     A()
     {
     Scanner sc = new Scanner(System.in);
         System.out.print("enter any two number");
         a=sc.nextInt();
         b=sc.nextInt();
     }
     void show()
     {
         System.out.println("A="+a);
         System.out.println("B="+b);
     }
 }
class B
{
    public static void main(String[] args)
    {
        A obj= new A();
        obj.show();
    }
}