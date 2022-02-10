import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public abstract class Page
{
	WebDriver driver;

	public Page(WebDriver driver)
	{
		this.driver = driver;
	}

	//abstract methods
	public abstract String getPageTitle();
	public abstract String getPageHeader(By locator);
	public abstract WebElement getElement(By locator);

	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass)
	{

		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		} catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

}
