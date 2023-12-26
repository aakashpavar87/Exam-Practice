class Animal{  
void eatSomething(){System.out.println("eating something");}  
}  
  
class Dog extends Animal{  
@Override  
void eatSomething(){int a=12;System.out.println("eating foods" + 23);}//should be eatSomething  
}  

public class Myannot{
	public static void main(String[] args) {
		Animal a=new Dog();  
		a.eatSomething();  		
	}
}