package stringIndexOutExceptionExample;

import java.util.Iterator;

public class StringIndexOutExceptionExample {
	public static void main(String[] args) {
		String data="Rohit";
		try{
           System.out.println(data.charAt(5));
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString()+"\n Please try Get Data from String Less than and equal to 4");
			
		}
	}

}
