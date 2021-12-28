package genericJavaUtilities;

import java.util.Date;
import java.util.Random;

public class JavaUtilities {
	/*@Test
	public void getRandomNumber()
	{
		Random r = new Random();
		int rnum = r.nextInt(10000);
		//return rnum;
		System.out.println(rnum);
		
	}
	@Test
	public void getSysDate()
	{
		Date date = new Date();
		String r = date.toString();
		//return r;
		System.out.println(r);
	}*/
	
	public String getSysDate() {
		Date d = new Date();
		String date =d.toString().replace(" ","_").replace(":", "_");
		return date;
	}

}
