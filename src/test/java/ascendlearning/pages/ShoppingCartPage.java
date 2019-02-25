package ascendlearning.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.ui.ExpectedCondition;

@DefaultUrl("")
public class ShoppingCartPage extends PageObject {
	@FindBy(id = "shoppingCart")
	private WebElementFacade frmCartPage;

	@FindBy(xpath = "//div[@id='shoppingCart']/div[3]/div[2]/button")
	private WebElementFacade btnCheckout;

	@FindBy(css = "tbody tr:nth-child({1}) td span[id*=newPriceLabel]")
	private WebElementFacade lblPrice;

	@FindBy(xpath = "//div[@id='shoppingCart']//figcaption//label[text()='{1}']/parent::h2/parent::figcaption//input")
	private WebElementFacade txtQuantity;

	@FindBy(xpath = "//tr[td/div/a[contains(.,'{1}')]]/td/span/span[2]/span/a")
	private WebElementFacade lnkUpdate;

	@FindBy(css = "button[class*='close-btn']")
	private WebElementFacade lnkRemove;

	@FindBy(css = "div[id*='shoppingCart'] a[class*='text-bold']")
	private WebElementFacade lnkContinueShopping;

	@FindBy(xpath = "//div[@id='countlabel']")
	private WebElementFacade lblCartCount;

	@FindBy(xpath = "//div[@id='shoppingCart']//figcaption//label[text()='{1}']/parent::h2/parent::figcaption/button")
	private WebElementFacade removeLinkForProduct;

	@FindBy(css = "div[class*='table-responsive']")
	private WebElementFacade tblDiscountInfo;

	@FindBy(xpath = "//table[@class='table table-bordered']//tr")
	private WebElementFacade tblPromoRow;

	@FindBy(xpath = "//div[@id='shoppingCart']//td[contains(text(),'Discount')]/parent::tr/td[2]")
	private WebElementFacade lblDiscount;

	@FindBy(xpath = "//div[@id='shoppingCart']//td[contains(text(),'Subtotal')]/parent::tr/td[2]")
	private WebElementFacade lblSubTotal;

	@FindBy(css = "input[placeholder*='Enter Code']")
	private WebElementFacade txtCouponCod;

	@FindBy(css = "button[class*='btn btn-lg btn-primary']")
	private WebElementFacade btnApplyCoupo;

	@FindBy(css = ".alert.alert-danger.icon-alert-danger.alert-dismissable.m-t-1")
	private WebElementFacade lblMaxLimitErrMsg;

	@FindBy(xpath = "//*[@id='shoppingCart']//tr[3]/th[2]/span")
	private WebElementFacade lblTotalAfterDiscount;

	@FindBy(css = "div[class*='alert']")
	private WebElementFacade lblMaxCouponLimitMsg;

	@FindBy(css = "a[class*='icon-close']")
	private WebElementFacade lnkRemoveCoupon;

	@FindBy(css = "figcaption h2 a")
	private WebElementFacade lnkProductName;

	@FindBy(css = "figcaption h2 label")
	private WebElementFacade lnkAFAAProductName;

	@FindBy(css = "div[class*='table-responsive'] label[class*='alert-info']")
	private WebElementFacade lblFreeShippingMsg;

	@FindBy(id = "Ecommerce_Checkout_C006_ctl00_ctl00_couponError")
	private WebElementFacade lblInavlidCouponErrorMsg;

	@FindBy(xpath = "//div[@id='shoppingCart']//figcaption//label[text()='{1}']/parent::h2/parent::figcaption//span[@data-price='total']")
	private WebElementFacade lblProductPrice;

	@FindBy(xpath = "//figcaption/h2/a[contains(text(),'{1}')]/parent::h2/parent::figcaption/footer/span")
	private WebElementFacade lnkProductPrice;

	@FindBy(css = ".table.table-bordered>tbody>tr>td:nth-child(1)")
	private WebElementFacade lblCouponCodeFromDiscountTable;

	@FindBy(css = ".alert-dismissable.m-t-1.center-block")
	private WebElementFacade lnkInvalidErrorMessag;

	@FindBy(css = ".table.table-bordered>tbody>tr")
	private WebElementFacade tblListOfCouponsValidOrInvalid;

	@FindBy(css = ".text-bold.input-group.input-group-lg.input-numbers.m-b-0 > input")
	private WebElementFacade txtQuantityField;

	@FindBy(css = ".text-bold.m-b-0.text-size-3")
	private WebElementFacade lblPageNotFound;

	@FindBy(css = ".alert.alert-warning.icon-alert-warning.col-xs-12.col-md-8.m-y-1")
	private WebElementFacade lblEmptyCar;

	@FindBy(css = ".alert.alert-info.icon-alert-info.col-xs-12.col-md-8.m-y-1")
	private WebElementFacade lblBogoProductRemovedErrmsg;

	@FindBy(xpath = "//table[@class='table table-bordered']//td[text()='{1}']/parent::tr//a")
	private WebElementFacade lnkRemoveCouponCode;

	@FindBy(xpath = "//figcaption//a[text()='{1}']/parent::h2/parent::figcaption//div[2]/span[1]")
	private WebElementFacade txtProductPrice;

	@FindBy(css = "a[class*='nasm']")
	private WebElementFacade lnkLogoNASM;
	
	public Boolean shoppingCartPageDisplayed() {
		waitFor(frmCartPage);
		return frmCartPage.isVisible();
	}
	
	public boolean isProductPresentInCart(String strProduct){
		List<WebElementFacade> lstProducts=findAll("figcaption h2 a");
		for(WebElement prd:lstProducts){
			if(strProduct.equalsIgnoreCase(prd.getText().trim())){
				return true;
			}
		}
		return false;
	}
	
	public void clickCheckOutButton() {
		btnCheckout.click();
		withTimeoutOf(30, TimeUnit.SECONDS).waitFor(By.cssSelector("#firstName"));
	}
}