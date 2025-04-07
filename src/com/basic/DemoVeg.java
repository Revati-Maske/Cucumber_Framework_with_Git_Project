/*package com.basic;



	import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;*/

	/*public class DemoVeg {
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			String [] itemsNeeded = {"Cucumber","Tomato"};
			int j =0;
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			driver.manage().window().maximize();
			List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
			for(int i=0; i< products.size(); i++) {
				// format this name to get only vegetable name excluding - 1 kg
				String[] name = products.get(i).getText().split("-");
				String formattedName = name[0].trim();    // trim() will remove whitespaces present in both sides
				//Convert array into arrayList at runtime for easy search
				//check whether name you extracted is present in arraylist or not
				List items = Arrays.asList(itemsNeeded);
				if(items.contains(formattedName)) {
					j++;
					//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if(j==3) {
					break;
				}
				
				}
			}

		}

	}*/



