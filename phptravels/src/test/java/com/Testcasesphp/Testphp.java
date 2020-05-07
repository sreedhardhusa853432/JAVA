package com.Testcasesphp;




import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.BaseClass.Libraryphp;
import com.pagesphp.pagesphp;
import com.pagesphp.pagesphp1;

public class Testphp extends Libraryphp {
		
		@BeforeClass
		public void startUp() throws IOException {
			launchApp();
			
		}
		@Test
		public void Location() throws Throwable {
		pagesphp lpage = new  pagesphp(driver);
		lpage.currency();
		lpage.Eur();
		lpage.Flights();
	//	lpage.From();
	lpage.searchfrom("Los Angeles (LAX)");
		lpage.To("Dallas Fortworth (DFW)");
		lpage.Date();
		lpage.Day();
		//lpage.Select_currency();
	//	lpage.Select_Euros();
		//lpage.Select_flights();
//	lpage.Select_from();
	//	lpage.Select_to();
		}
		
}
