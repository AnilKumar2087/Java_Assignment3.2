class Animal
{  
String color="white";  
}  
class Dog extends Animal
{  
String color="black";  
void printColor()
{  
System.out.println("without using super color is " +color);//prints color of Dog class  

//super is used to refer parent class variables


System.out.println("using super color is  " +super.color);//prints color of Animal class  
}  
} 

class cat extends Animal
{
	public cat(String color)
	{
		
		this.color=color;
	}

}

public class Super_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d=new Dog(); 
		cat c=new cat("red");
		d.printColor();
		
		System.out.println("using this color is  " +c.color);	

	}

}
