import java.util.Scanner;
abstract class animal
{
public String breed,colour;
animal(String breed,String colour)
{
this.breed=breed;
this.colour=colour;
}
public String getbreed()
{
return breed;
}
public String getcolour()
{
return colour;
}
public abstract void speak();
}
class dog extends animal
{
dog(String b,String c)
{
super(b,c);
}
public void speak()
{
System.out.println("Dog barks " + " :  " + "breed = "+getbreed() + ", " +  "colour = "+getcolour());
}
}
class Cat extends animal
{
Cat(String b, String c)
{
super(b,c);
}
public void speak()
{
System.out.println("Cat meows " +  " : " + " breed = "+getbreed()+ "," + " colour = "+getcolour());
}
}
class que2
{
public static void main(String[] args)
{
Cat c = new Cat("Persian","white");
dog d = new dog("german shephard","black");
d.speak();
c.speak();
}
}
