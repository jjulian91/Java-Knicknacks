//illustrate inheritance and constructors

class Dog {
	protected int age;
	public Dog() {
		age = 0;
		System.out.println("Inside Dog constructor");
	}
	public Dog(int theAge) {
		age = theAge;
	}
	public void display() {
		System.out.println(age);
	}
}

class Chihuahua extends Dog {
	public Chihuahua(int myAge) {
		age = myAge + 1;
		System.out.println("Inside Chihuahua constructor");
	}
}

public class TestDog {
	public static void main(String[] args) {
		Dog rex = new Dog(4);
		Dog spot = new Chihuahua(5);
		rex.display();
		rex = spot;
		rex.display();
	}
}
