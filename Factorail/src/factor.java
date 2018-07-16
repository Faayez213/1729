
public class factor {

	private static int number; 
	
	
	public static int Getfactor()
	{
		int result=1;
		while(number>0)
		{
			result=result*number;
			number--;
		}
		return result; 
	}
	
	

	public factor() {
		super();
		// TODO Auto-generated constructor stub
	}




	public static int getNumber() {
		return number;
	}


	public static void setNumber(int number) {
		factor.number = number;
	}
}
