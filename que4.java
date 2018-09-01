import java.util.Scanner;
abstract class vehicle
{
public abstract void start();
public abstract void stop();
}
class twowheeler extends vehicle
{
public void start()
{
System.out.println("twowheeler Started");
}
public void stop()
{
System.out.println("twowheeler Stopped");
}   
}
class fourwheeler extends vehicle
{
public void start()
{
System.out.println("fourwheeler Started");
}
public void stop()
{
System.out.println("fourwheeler Stopped");
}
}
class que4
{
public static void main(String[] args)
{
twowheeler t = new twowheeler();
fourwheeler f = new fourwheeler();
t.start();       
t.stop();
f.start();
f.stop();
}
}