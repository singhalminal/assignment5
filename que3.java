import java.util.Scanner;
class print
{
public void print()
{
System.out.println("null argument");
}
public void print(int x)
{
System.out.println("integer argument "+ "= " + x);
}
public void print(float m)
{
System.out.println("float argument "+ " = " + m);
}
}
class que3
{
public static void main(String[] args)
{
print a = new print();
print b = new print();
print c = new print();
a.print();
b.print(28);
c.print(28.5f);
}
}