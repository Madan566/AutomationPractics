package HomePageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageObject extends BasePage {

	@FindBy(xpath = "//a[contains(@title, 'Women')]")
	public WebElement Womens;

	@FindBy(xpath = "(//a[@title=\"Dresses\"])[2]")
	public WebElement Dresses;

	@FindBy(xpath = "(//a[@title=\"T-shirts\"])[2]")
	public WebElement TShirts;

	@FindBy(xpath = "(//spam[contains(text(),'Women')])[2]")
	public WebElement womennav;

	@FindBy(xpath = "(//spam[contains(text(),'Dresses')])[1]")
	public WebElement dressnav;

	@FindBy(xpath = "(//spam[contains(text(),'T-shirts')])[1]")
	public WebElement tshirtnav;

	@FindBy(id = "newsletter-input")
	public WebElement newstxtbox;

	@FindBy(xpath = "//button[@class='btn btn-default button button-small')]")
	public WebElement newssubbtn;

	@FindBy(xpath = "//p[@class='alert alert-success']")
	public WebElement sucs;

	public HomepageObject() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return Womens;
	}

	public WebElement getDresses() {
		return Dresses;
	}

	public WebElement gettshirts() {
		return TShirts;
	}

	public void clickWomen() {
		Womens.click();
	}

	public String getTitleWomen() {
		return womennav.getText();
	}

	public void clickDresses() {
		Dresses.click();
	}

	public String getTitleDresses() {
		return dressnav.getText();
	}

	public void clickTshirts() {
		TShirts.click();
	}

	public String getTitleTshirts() {
		return tshirtnav.getText();
	}

	public void setNewsLetter(String email) {
		setText(newstxtbox, email);
		newssubbtn.click();
	}

	public String getTxtNewsletterMessage() {
		return sucs.getText();
	}

}
