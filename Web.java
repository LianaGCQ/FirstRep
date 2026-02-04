package webdriver;

import org.openqa.selenium.WebDriver;
//1. Change the import to EdgeDriver
import org.openqa.selenium.edge.EdgeDriver;

public class Web {

 public static void main(String[] args) {
     
     // 2. Initialize the Edge Driver
     WebDriver driver = new EdgeDriver();

     try {
         driver.get("https://www.google.com");
         
         System.out.println("Page Title is: " + driver.getTitle());
         
         Thread.sleep(3000000);

     } catch (InterruptedException e) {
         e.printStackTrace();
     } finally {
         driver.quit();
     }
 }
}