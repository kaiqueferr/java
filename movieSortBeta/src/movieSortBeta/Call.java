package movieSortBeta;

import java.util.ArrayList;

public class  Call {
	
	ArrayList<Terror> terror = new ArrayList<Terror>();
	ArrayList<Terror> comedia = new ArrayList<Terror>();
	ArrayList<Terror> romance = new ArrayList<Terror>();
	
	String[] a = {" ", " "}; 
	int n;
	Terror retorno;
	
	public Call(int n) {
		this.n = n;
		
		Terror t1 = new Terror("a","v","v",a, 5.6, 2006, "v");
		terror.add(t1);
		t1 = new Terror("b","v","v",a, 7.5, 2006, "v");
		terror.add(t1);
		
		if(n == 1)
		{
			retorno = t1;
		}
		
		
	}
	
	public ArrayList<Terror> ret()
	{
		return terror;
	}
	

	

}

