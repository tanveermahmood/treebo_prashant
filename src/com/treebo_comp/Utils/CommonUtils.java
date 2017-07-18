package com.treebo_comp.Utils;

import java.util.HashMap;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriver;
import com.treebo_comp.Bean.ProductInfoBean;

public class CommonUtils {
	public static void setProductItem(HashMap<String, ProductInfoBean> productsList) {
		ConfigurationManager.getBundle().addProperty("product.information", productsList);
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, ProductInfoBean> getProductItems() {
		HashMap<String, ProductInfoBean> productsList;
		if (ConfigurationManager.getBundle().containsKey("product.information")) {
			productsList = ((HashMap<String, ProductInfoBean>) ConfigurationManager.getBundle()
					.getProperty("product.information"));

		} else {
			productsList = new HashMap<String, ProductInfoBean>();
			ConfigurationManager.getBundle().addProperty("product.information", productsList);
		}
		return productsList;
	}

	public static void switchToWindow(QAFWebDriver driver) {
		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
	}
}
