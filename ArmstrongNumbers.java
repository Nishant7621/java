


// class SumOfNum  
// { 
//      public static void main(String args[])  
//      {      	 	int sum = 0; 
//           for (int i = 1; i <= 100; i++)  
//           { 
//                if (i % 2 != 0)  
//                { 
//                     sum = sum + i; 
//                } 
//           } 
//           System.out.println("The Sum Of 100 Odd Numbers are:" + sum); 
//      } 
// } 

// class SumOfNum 
//     { 
//      	public static void main(String args[]) 
//      	{      	 	int sum = 0;      	 	int n=10; 
//      	 	for(int i = 1;i <= n;i++) 
//      	 	{ 
//      	 	 	sum = sum + i; 
//      	 	} 
//      	 	System.out.println("The Sum Of "+n+" Numbers are:" + sum); 
//      	} 
//     } 


// class digitsum 
// {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter any number");
//     int num=sc.nextInt();
//     int sum=0;  
//     int rem=0;    int temp;
//     temp = num; 
//     while(num!=0) {
//         sum+=num%10;
//         num = num/10;
//     }     
//      System.out.println("sum of digits is:"+temp+"is"+sum);           
// }
// }

// class digitproduct
// {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter any number");
//     int num=sc.nextInt();
//     int product=1;
//     while(num!=0) {
//         int digit = num%10 ;
//         product = product * digit ;
//         num= num/10; }
//         System.out.println("sum of digit is :"+product);
//     }
// }


// public class ElectricBill 
//     { 
//      	public static void main(String args[]) 
//      	{  Scanner sc = new Scanner(System.in);
//     System.out.println("enter units");
//             int units = sc.nextInt();
//     int bill = 0; 
      
//     if (units > 100) 
//      	 	{ 
//     if (units >= 200) 
//     { 
//     if (units > 300) 
//      	 	 	 	{ 
//      	 	 	 	 	bill = units * 8; 
//      	 	 	} 
//      	 	 	else 
//      	 	 	 	bill = units * 6; 
//      	 	} 
//      	 	else 
//      	 	 	bill = units * 5; 
//      	 	} 
      
//      	 	System.out.println("CHENNAI ELECTRICITY LTD, CHENNAI"); 
//      	 	System.out.println("Units Consumed : " + units); 
//      	 	System.out.println("Total Bill : " + bill); 
//      	} 
//     } 

// public class ArmstrongNumber 
//     { 
//      	public static void main(String args[]) 
//      	{ 
// 			System.out.print("enter any number:");
//     Scanner sc = new Scanner(System.in);
// 	int n=sc.nextInt();
// 	int arg;  int r;  int sum=0;
// 	arg = n;
// 	for(int i=1;i<n;i++)
// 	{
// 		while(n>0)
// 		{
// 			r=n%10;
// 			sum=sum + (r*r*r);
// 			n = n/10;

// 		}
// 	} if(arg==sum)
// 	{
// 		System.out.println("this number is armstrong:"+arg);
// 	}
// 	else 
// 	{
// 		System.out.println("this number is not armstrong:"+arg);
// 	}
// 		}
// 	}


public class ArmstrongNumbers {
    public static void main(String[] args) {
        int num, r, sum;
        int limit = 1000;
        
        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int i = 1; i <= limit; i++) {
            num = i;
            sum = 0; // Reset sum for each number

            while (num > 0) {
                r = num % 10;
                sum = sum + (r * r * r);
                num = num / 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}




