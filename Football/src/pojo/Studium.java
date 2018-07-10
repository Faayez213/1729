package pojo;

public class Studium {
	private String name;
	private int seat; 
	private int pitchLenght;
	private int pitchWidth; 
	private String pitchType;
	private int goalHeight; 
	private int goalWidth; 
	private int lights; 
	

	public void recordMatch() {
		System.out.println("Recording Match....");
	}
	
	
	
	
	
	public Studium(String name, int seat, int pitchLenght, int pitchWidth, String pitchType, int goalHeight,
			int goalWidth, int lights) {
		super();
		this.name = name;
		this.seat = seat;
		this.pitchLenght = pitchLenght;
		this.pitchWidth = pitchWidth;
		this.pitchType = pitchType;
		this.goalHeight = goalHeight;
		this.goalWidth = goalWidth;
		this.lights = lights;
	}
	
	





	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public int getPitchLenght() {
		return pitchLenght;
	}

	public void setPitchLenght(int pitchLenght) {
		this.pitchLenght = pitchLenght;
	}

	public int getPitchWidth() {
		return pitchWidth;
	}

	public void setPitchWidth(int pitchWidth) {
		this.pitchWidth = pitchWidth;
	}

	public String getPitchType() {
		return pitchType;
	}

	public void setPitchType(String pitchType) {
		this.pitchType = pitchType;
	}

	public int getGoalHeight() {
		return goalHeight;
	}

	public void setGoalHeight(int goalHeight) {
		this.goalHeight = goalHeight;
	}

	public int getGoalWidth() {
		return goalWidth;
	}

	public void setGoalWidth(int goalWidth) {
		this.goalWidth = goalWidth;
	}

	public int getLights() {
		return lights;
	}

	public void setLights(int lights) {
		this.lights = lights;
	}



}
