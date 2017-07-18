package com.treebo_comp.Page;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.treebo_comp.Utils.Generic1;

public class HomeTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "Homepage.Input.txt")
	private QAFWebElement homepageInputTxt;
	@FindBy(locator = "Homepage.CheckIn.txt")
	private QAFWebElement homepageCheckInTxt;
	@FindBy(locator = "Homepage.CheckOut.txt")
	private QAFWebElement homepageCheckOutTxt;
	@FindBy(locator = "Homepage.Search.btn")
	private QAFWebElement homepageSearchBtn;
	@FindBy(locator = "Homepage.Room.txt")
	private QAFWebElement homepageRoomTxt;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
		driver.get("/");
	}

	public QAFWebElement getHomepageInputTxt() {
		return homepageInputTxt;
	}

	public QAFWebElement getHomepageCheckInTxt() {
		return homepageCheckInTxt;
	}

	public QAFWebElement getHomepageCheckOutTxt() {
		return homepageCheckOutTxt;
	}

	public QAFWebElement getHomepageSearchBtn() {
		return homepageSearchBtn;
	}

	public QAFWebElement getHomepageRoomTxt() {
		return homepageRoomTxt;
	}

	public void searchHotel() {
		Generic1 generic = new Generic1(driver);
		generic.kw_enter_text1(getHomepageInputTxt(),"Pune");
		getHomepageCheckInTxt().sendKeys("2017-06-23");
		getHomepageCheckOutTxt().sendKeys("2017-07-18");
		generic.kw_dropdown(getHomepageRoomTxt(), 0);
		getHomepageSearchBtn().click();
		

	}
}
