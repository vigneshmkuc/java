class A extends thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
system.out.println("\t from thread A:i="+i);
}
system.out.println("exit from A");
}
}
class B extends thread
{
public void run()
{
for(int j=1;j<=5;j++)
{
system.out.println("\t from thread B:j="+j);
}
system.out.println("exit from B");
}
}
class C extends thread
{
public void run()
{
for(int k=i;k<=5;k++);
{
system.out.println("\t from thread C:k="+k);
}
system.out.println("exit from C");
}
}
class test
{
public static void main(string h[])
{
A a=new A();
B b=new B();
C c=new C();
a.start();
b.start();
c.start();
}
}