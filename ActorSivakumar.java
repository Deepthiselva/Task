package Programs;

public class ActorSivakumar implements Actor {
	static String address = "Coimbatore";
	int age;
	String CarType;

	
	public ActorSivakumar(int age, String CarType) {
		this.age = age;
		this.CarType = CarType;
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ActorSivakumar as = new ActorSivakumar(65, "Audi Car");
		as.act();
		as.dance();
		as.sing();
		
		System.out.println( as.speaking());
		System.out.println(ActorSivakumar.address );
	}
	
	public String speaking() {
		String a = "Cat";
			return a;
		
	
	}
         
	@Override
	public void act() {
		System.out.println("Deepthi Actress");
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public void dance() {
		System.out.println("Deepthi Dance");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sing() {
		System.out.println("Deepthi Sing");
		// TODO Auto-generated method stub
		
	}

}
