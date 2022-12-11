package Programs;

public class Sivakumar extends ActorSivakumar implements Actor{
	

	public Sivakumar(int age, String CarType) {
		super(age, CarType);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Actor ac = new Sivakumar(65, "Benze");	// dynaic binding
		ac.act();
		ac.dance();
		ac.sing();
		System.out.println(ac.address);
	
		
		
	}

}
