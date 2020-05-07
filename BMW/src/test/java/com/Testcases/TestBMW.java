package com.Testcases;


import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Baseclass.Library;
import com.pages.Bmwclass;

public class TestBMW extends Library {
		Bmwclass demo;
		@BeforeClass
		public void startUp() throws IOException{
			launchApp();
		}

		@Test
		public void Model() throws Throwable {
			demo=new Bmwclass(driver);
		demo.Model();
		demo.link();
		demo.image();
		demo.technicaldata();
	demo.speed();
		demo.condition();
		
		
		}
		
	}
