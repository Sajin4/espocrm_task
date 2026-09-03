package Base_class;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base_class7 {
	
	public static WebDriver wd ; // instance variable
	
	   public static WebDriver browserlaunch() {
		  wd = new ChromeDriver();
		  wd.manage().deleteAllCookies();
		  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  wd.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		  return wd;
		}
		
	   public static void max() {
			
		  wd.manage().window().maximize();  
		  
				
		}
	   
	   public static void openurl(String url) {
		
	    wd.get(url);	
		
		}
		
		public static void close() {
			wd.close();
		}
		public static void quit() {
			wd.quit();
		}
		
		public static String getCurrentUrl() {
		    return wd.getCurrentUrl();
		}

		public static String getTitle() {
		    return wd.getTitle();
		}
		
		//Navigate
		public static void navigateTo(String url) {
	        wd.navigate().to(url);
	    }
		
		public static void back() {
			wd.navigate().back();
		}
		
		public static void forward() {
		    wd.navigate().forward();
		}
		
		public static void refresh() {
		    wd.navigate().refresh();
		}
		
		public static void clicks(WebElement element) {
			
			element.click();
			
		}
		

		 public static void sendKeys(WebElement element, String value) {
	       element.sendKeys(value);
	   }

		 public static void clear(WebElement element) {
		    element.clear();
		}
		  
		 public static String getText(WebElement element) {
		    return element.getText();
		}
		 
		 public static String getAttribute(WebElement element, String attribute) {
		    return element.getAttribute(attribute);
		}
		 
		 public static boolean isDisplayed(WebElement element) {
			 return element.isDisplayed();
		}

		 public static boolean isEnabled(WebElement element) {
		     return element.isEnabled();
		}
		 
		 public static boolean isSelected(WebElement element) {
		     return element.isSelected();
		}
		
		 //Actions
		 
		 public static void moveToElement(WebElement element) {
			 Actions a = new Actions(wd);
			 a.moveToElement(element).build().perform();
			
		 }
			
	     public static void dragAndDrop(WebElement source , WebElement target) {    
					Actions a = new Actions(wd);
					a.dragAndDrop(source, target).build().perform();
					
	     }
	     
	     public static void rightClick(WebElement element) {
			 Actions a = new Actions(wd);
			 a.contextClick(element).build().perform();
	     
	     }
	 
	     public static void doubleClick(WebElement element) {
			 Actions a = new Actions(wd);
			 a.doubleClick(element).build().perform();
			 
	     }
	     
	     public static void clickAndHold(WebElement element) {
			 Actions a = new Actions(wd);
			 a.clickAndHold(element).build().perform();
		 }
	     
		 public static void release(WebElement element) {
			 Actions a = new Actions(wd);
			 a.release(element).build().perform(); 	 
		 }
		 
		 public static void actionClick(WebElement element) {
			    Actions actions = new Actions(wd);
			    actions.moveToElement(element).click().perform();
		 }
		 
		 //scroll by
		 
		 public static void scrollByAmount(int x, int y) {
			    Actions actions = new Actions(wd);
			    actions.scrollByAmount(x, y).perform();
			}
		
		 
		 //Alerts
		 public static void acceptAlert() {
			wd.switchTo().alert().accept();
			}
			 
		 public static void dismissAlert() {
			wd.switchTo().alert().dismiss();
			}
			 
		 public static void sendKeysToAlert(String text) {
			wd.switchTo().alert().sendKeys(text);
			}
		 
			 
			//Waits
			 public static void implicitWait(int seconds) {
				 wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
			 }
			 public static WebElement explicitWaitClickable(WebElement element) {
				 return new WebDriverWait(wd, Duration.ofSeconds(20)).
						 until(ExpectedConditions.elementToBeClickable(element));
			 }
			 public static WebElement explicitWaitVisible(WebElement element) {
				 return new WebDriverWait(wd, Duration.ofSeconds(10)).
						 until(ExpectedConditions.visibilityOf(element));
			 }
			 public static Boolean explicitWaitTitleContains(String title) {
				 return new WebDriverWait(wd, Duration.ofSeconds(10)).
						 until(ExpectedConditions.titleContains(title));
			 }		
			
			 
			 public static boolean explicitWaitInvisibility(WebElement element) {

				    return new WebDriverWait(wd, Duration.ofSeconds(10))
				            .until(ExpectedConditions.invisibilityOf(element));
				}
				
			 //javascriptexecutor
			 public static void scrollDown(int pixels) {

				    JavascriptExecutor js = (JavascriptExecutor) wd;

				    js.executeScript("window.scrollBy(0, arguments[0]);", pixels);
			 }
			 
		   //ScrollToElement
			 public static void ScrollToElement(WebElement element) {
				    	JavascriptExecutor js = (JavascriptExecutor) wd;
				    	js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);
				    	}
				}
			
		


