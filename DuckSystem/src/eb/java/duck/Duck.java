package eb.java.duck;

public abstract class Duck {

	Flyable flyable;
	Quackable quackable;
	
	public void swim(){
		System.out.println("duck is swim");
	}
	public abstract void display();
	
	public void setFlayable(Flyable flyable){
		this.flyable = flyable;
	}
	
	public void setQuackable(Quackable quackable){
		this.quackable = quackable;
	}
	
	public void perFormFly(){
		flyable.fly();
	}
	
	public void perFormQuack(){
		quackable.quack();
	}
	
}