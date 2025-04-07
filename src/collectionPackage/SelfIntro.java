package collectionPackage;

import java.util.ArrayList;
import java.util.Arrays;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class SelfIntro {

	public static void main(String[] args) {
		// for google chrome
		//WebDriver driver = new ChromeDriver();

		// for Firefox Driver
		//WebDriver driver = new FirefoxDriver();

		// for microsoft edge
//		WebDriver driver = new EdgeDriver();
//		
//		driver.get("https://rahulshettyacademy.com");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();
		
		
		        int [] numbers = {10, 20, 30, 40, 50};
		        System.out.println(numbers[0]);
		        System.out.println(numbers[4]);
		        for(int i = numbers.length-1; i>=0; i--){
		            System.out.println(numbers[i]);
		        }
		        System.out.println(numbers.length);
		        
		        
		        ArrayList<String> a = new ArrayList<String>();
		        a.add("Rahul");
		        a.add("Shetty");
		        a.add("Academy");
		        a.add("Selenium");
		        for( String val :a) {
		        	System.out.println(val);
		        }
		        System.out.println(a.contains("Selenium"));
		        
		        String [] name = {"A", "B", "C", "D"};
		       System.out.println(Arrays.asList(name));
		    
		    }

		
		

	}


