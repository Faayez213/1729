package pojo;

public class Ball {


	private String color;
	private int weight;
	private String brand; 
	
	public void move() {
		System.out.println("Move");
	}
	
	public Ball(String color, int weight, String brand) {
		super();
		this.color = color;
		this.weight = weight;
		this.brand = brand;
	}
	
	
	
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}



	
}
