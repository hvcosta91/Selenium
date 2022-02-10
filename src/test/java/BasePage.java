import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends Page
{

	public BasePage(WebDriver driver)
	{
		super(driver);
	}

	@Override
	public String getPageTitle()
	{
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator)
	{
		return getElement(locator).getText();
	}

	@Override
	public WebElement getElement(By locator)
	{
		WebElement element = null;

		try {
			element = driver.findElement(locator);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return element;
	}
}
