package pojo;

public class Referee {
	private String name;
	
	
	private String nationality;
	private int age; 
	private String catageroy;
	private int expereince; 
	
	public void judgeMatch() {
		
		System.out.println("Judging Match...");
	}
	
	public void controlMatch() {
		
		System.out.println("Controling Match..");
	}
	
	public void allowSubstitution() {
		
		System.out.println("Allowing Substitution...");
	}
	
	
	
	
	
	public Referee(String name, String nationality, int age, String catageroy, int expereince) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.age = age;
		this.catageroy = catageroy;
		this.expereince = expereince;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCatageroy() {
		return catageroy;
	}

	public void setCatageroy(String catageroy) {
		this.catageroy = catageroy;
	}

	public int getExpereince() {
		return expereince;
	}

	public void setExpereince(int expereince) {
		this.expereince = expereince;
	}


	

}
