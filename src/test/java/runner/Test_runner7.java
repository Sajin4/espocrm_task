package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Base_class.base_class7;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//from feature file path
		 features = "src\\test\\java\\features", 
			//from step definition package
	        glue = "steps",  
	        dryRun = false,
	        //tags = "@cart and @smartphone",
	        
	        plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
	       
	        monochrome = true
		
		)


public class Test_runner7 extends base_class7 {


	@BeforeClass
	public static void setup() {
		browserlaunch();
		max();
	}
	
	@AfterClass
	public static void end() {
	    //wd.quit();
	}
		
  }

