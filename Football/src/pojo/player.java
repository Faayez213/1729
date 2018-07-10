package pojo;

public class player {
	
	
	private String firstName;
	private int age;
	
	public void kick() {
		System.out.println("Kick");
		System.out.println();
	}
	
	
	public player(String firstName, int age) {
		super();
		this.firstName = firstName;
		this.age = age;
	}


	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	
}
