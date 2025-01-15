package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {
	@Before("@NetBanking")
	public void netBankingSetup() {
		System.out.println("**********************");
		System.out.println("User is on net banking page");
	}
	@After()
	public void tearDown() {
		System.out.println("Clear all entries");
	}
	@Before("@Mortgage")
	public void mortgageSetup() {
		System.out.println("User is on mortgage banking page");
	}
	@After()
	public void tearDown1() {
		System.out.println("Clear all entries");
	}
}
