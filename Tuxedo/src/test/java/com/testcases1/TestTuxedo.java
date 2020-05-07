package com.testcases1;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.library1.library1;
import com.pages1.pages1;
public class TestTuxedo  extends library1 {
		
		@BeforeClass
		public void startUp() throws IOException{
			launchApp();
		}

		@Test
		public void login() {
		pages1 lpage = new pages1(driver);
		lpage.Search("Tuxedo");
		lpage.Logo();
		lpage. Featured();
		lpage.High();
		lpage.Tuxedo();
		lpage.size();
		lpage.size1();
		lpage.Quantity();
		lpage.addtocart();
		
	//	lpage.loginToApp_loginbtn();
		
		}
		
	}
	