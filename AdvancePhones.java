import java.io.*;
import java.util.*;

 class Mobile {	
     //encapsulation = data hiding + abstraction 
     
	private String manufacturer;//data hiding through private keyword
	private String operating_system;
	public String model;
	//Constructor to set properties/characteristics of object
	Mobile(String man, String o,String m){
		this.manufacturer = man;
		this.operating_system=o;
		this.model=m;
	}
	//Method to get access Model property of Object
	public String getModel(){ //encapsulating data members and member functions
		return this.model;
	}
}
//Inheritance
 class IOS extends Mobile{
		IOS(String man, String o,String m){
				super(man, o,m);
			}
		public String getModel(){
			return "This is an IOS Mobile- " + model;
		}
}
//Inheritance
 class Blackberry extends Mobile{
	//Constructor to set properties/characteristics of object
	Blackberry(String man, String o,String m){
					super(man, o,m);
				}
	public String getModel(){
		return "This is Blackberry-"+ model;
	}
}
class Overloadsample {
    //overloading print methods
	public void print(String s){
		System.out.println("Method with only String(manufacturer)- "+ s);
	}
	public void print (int i){
		System.out.println("Method with only int(cost)- "+ i);
	}
	public void print (String s, int i){
		System.out.println("Third Method with both- "+ s + "--" + i);
	}
}
//abstraction
 abstract class BatteryCapacity {
	public abstract void mAh();
	public void units(){
		System.out.println("I am measured in milliamp Hour");
	}
}
//Override
class Mi extends BatteryCapacity{
	@Override
	public void mAh() {
		System.out.println("I am Mi note 8 pro, I offer 20000mAh");		
	}	
}
class Samsung extends BatteryCapacity{
	@Override
	public void mAh() {
		System.out.println("I am Samsung M30, I offer 18000mAh");
	}
}

public class AdvancePhones {
	public static void main(String[] args) {
	    Overloadsample obj = new Overloadsample();
	    System.out.println("Printing phone details and prices:..");
		obj.print(100000);
		obj.print("iphone 6");
		obj.print("iphone 6", 100000);
	    	//Creating Object of SuperClass and calling getModel Method
		Mobile m = new Mobile("Nokia", "Win8","Lumia");
		System.out.println(m.getModel()+" from nokia");
		//Creating Object of Sublcass and calling getModel Method
		IOS a = new IOS("iphone", "ios","iphone 6s");
		System.out.println(a.getModel());
		//Creating Object of Sublcass and calling getModel Method
		Blackberry b = new Blackberry("BlackB", "RIM","Curve");
		System.out.println(b.getModel());
		
		 Mi mi = new Mi();
		 Samsung sa= new Samsung();
		mi.units();
    	mi.mAh();
    	sa.units();
    	sa.mAh();
	}
}

