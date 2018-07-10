package pojo;

public class Coach {
	
	private String name; 
	private String nationality;
	private int age; 
	private int height; 
	private int expereince; 
	private String club; 
	
	
	public void trainPlayer() {
		System.out.println("Training player..");
	}

	public void selectPlayer() {
		System.out.println("Selecing player..");
	}
	
	public void choseFormation() {
		System.out.println("chosing player...");
	}
	
	
	
	
	public Coach(String name, String nationality, int age, int height, int expereince, String club) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.age = age;
		this.height = height;
		this.expereince = expereince;
		this.club = club;
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getExpereince() {
		return expereince;
	}

	public void setExpereince(int expereince) {
		this.expereince = expereince;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	
	
	
}
