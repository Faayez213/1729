
public class BubleSort {

	private static int [] data; 
	
	
	
	public static void SortBubble()
	{
		
		for(int i=0;i<data.length;i++)
		{
			///System.out.print(".." +data[i]);
			for(int j=0;j<i;j++)
			{
				if(data[i]<data[j])
				{
					int temp = data[i];
					data[i]= data[j];
					data[j]= temp; 
				}
		
			}
		
		
		}
	}
public static void print()
{
	for(int k=0;k<data.length;k++)
	{
		System.out.print(data[k]+ " ");

	}
	System.out.println();
}


public BubleSort() {
	super();
	// TODO Auto-generated constructor stub
}

public static int[] getData() {
	return data;
}
public static void setData(int[] data) {
	BubleSort.data = data;
}

}