package movieSortBeta;

import java.util.ArrayList;

public class Beta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Call c1 = new Call(1);
		
		ArrayList<Terror> t2 = c1.ret();
		  
		  System.out.println(t2.get(0).getImdb());
		  System.out.println(t2.get(1).getImdb());
		  
		  
		  
	}

}
