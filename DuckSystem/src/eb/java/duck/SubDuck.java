package eb.java.duck;

public class SubDuck extends Duck {

	public SubDuck(){
		flyable = new NomorFly();
		quackable = new GaQuack();
	}
	public void display(){
		System.out.println("subberDuck is display");
	}
	
	
	public static void main(String[] args) {
		SubDuck s = new SubDuck();
		s.display();
		s.swim();
		s.perFormFly();
		s.perFormQuack();
		
		s.setFlayable(new HighFly());
		s.perFormFly();
		
//		Quackable quackable = new GaQuack();
//		s.quackable = quackable;
//		s.perFormQuack();
	}
}
