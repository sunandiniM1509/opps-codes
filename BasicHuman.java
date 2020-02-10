import java.io.*;
import java.util.*;

class Human
{
  public void display ()
  {
    System.out.println ("I am Human, I am the parent class");
  }
}
//inheritance
class Woman extends Human
{
  @Override public void display ()
  {
    System.out.println ("I am a Woman, I am the child class of Human");
  }
  public String womanDetails (String name)
  {
    return name;
  }
//Overload
  public int womanDetails (int age)
  {
    return age;
  }
}

//encapsulation 
class Relation
{
//private keyword performs data hiding
  private String related;
//setters and getter to bind date members and member functions
  public String getName ()
  {
    return related;
  }
  public void setName (String relate)
  {
    related = relate;
  }
}

//abstraction
abstract class Profession
{
  public abstract void present ();
}
class Engineer extends Profession
{
  public void present ()
  {
    System.out.println ("\nWe are Engineers!");
  }
}
class BasicHuman
{
  public static void main (String[]args)
  {
    Human human = new Human ();
      human.display ();
    Woman woman = new Woman ();
      woman.display ();
      System.out.println (woman.womanDetails ("Keerthana"));
      System.out.println (woman.womanDetails (20));
    Relation encap = new Relation ();
      encap.setName ("BestFriends");
      System.out.print ("We are : " + encap.getName ());
    Engineer prof = new Engineer ();
      prof.present ();
  }
}
