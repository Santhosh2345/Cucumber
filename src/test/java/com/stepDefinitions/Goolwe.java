package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Goolwe extends Base_Class{

	
		@Given("user enter the amazon webpage")
		public void user_enter_the_amazon_webpage() {
		    base();
		    url("https://www.amazon.com");
		}
		@When("user click the search box")
		public void user_click_the_search_box() {
		   WebElement find_by = find_by(By.xpath("//input[@id='twotabsearchtextbox']"));
		   find_by.sendKeys("Pant"+Keys.ENTER);
		}
		@When("use enter the item name {string}")
		public void use_enter_the_item_name(String string) throws InterruptedException {
		    Thread.sleep(2000);
		}
		@Then("it shows the product for the {string}")
		public void it_shows_the_product_for_the(String string) {
		   quit();
		
	}

}
