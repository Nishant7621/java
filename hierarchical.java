class A 
{
void input()
{
    System.out.println("enter your name:");
}
}
class B extends A
{
    void show()
    {
        System.out.println("nishant");
}
    }
class C extends A
{
    void Disp()
    {
        System.out.println("ankit");
    }  
    }
class hierarchical
{
    public static void main(String[] args) {
        B r=new B();
        C r2=new C();
        r.input(); r.show();
        r2.input(); r2.Disp();
    }
}