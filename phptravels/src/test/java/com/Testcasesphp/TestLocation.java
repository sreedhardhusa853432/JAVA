package com.Testcasesphp;
	import java.io.IOException;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import com.BaseClass.Libraryphp;
import com.pagesphp.phplocation;

	public class TestLocation extends Libraryphp {
			
			@BeforeClass
			public void startUp() throws IOException {
				launchApp();
			}
			@Test
			public void Location() {
				phplocation loc = new  phplocation(driver);
				loc.Flights();
			loc.To();
			
			}
			
	}

