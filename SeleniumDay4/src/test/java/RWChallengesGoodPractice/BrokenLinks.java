package RWChallengesGoodPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

    public static void main(String[] args) throws MalformedURLException, IOException {

    	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        String siteURL = "https://www.eddymens.com/blog/page-with-broken-pages-for-testing-53049e870421";
        driver.get(siteURL);

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links found: " + links.size());

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            // Skip invalid or non-http links
            if (url == null || url.isEmpty() || url.startsWith("javascript") || 
                url.startsWith("mailto") || url.startsWith("tel")) {
                continue;
            }

            try {
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("HEAD");
                conn.setConnectTimeout(5000);
                conn.connect();

                int responseCode = conn.getResponseCode();
                if (responseCode >= 400) {
                    System.out.println(" Broken Link: " + url + " | Text: " + link.getText() + " | Code: " + responseCode);
                } else {
                    System.out.println(" Working Link: " + url + " | Code: " + responseCode);
                }

            } catch (Exception e) {
                System.out.println(" Exception checking link: " + url + " | Message: " + e.getMessage());
            }
        }

        driver.quit();
    }
}


