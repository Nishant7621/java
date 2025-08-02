import java.util.Scanner;

class Dcoder
{  
  public static void main(String args[])
  {  
      int a[]=new int[5];
      int max;
      Scanner sc=new Scanner(System.in);
    System.out.println("enter array elements");
for(int i=0;i<5;i++)      
      {
          a[i]=sc.nextInt();
      }
      max=a[0];
      for(int i=0;i<5;i++) 
      {
          if(a[i]>max)
          {
              max=a[i];
          }
      }
      System.out.println(max+"biggest array element");
      
  }
}

