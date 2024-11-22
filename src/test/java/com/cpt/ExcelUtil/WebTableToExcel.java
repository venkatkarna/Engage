package com.cpt.ExcelUtil;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cpt.Engagee.BaseTest;


public class WebTableToExcel extends BaseTest {
	

	public void tableToExcel() throws IOException {
		
		String path = ".\\Letter\\listofletters.xlsx";
		XLUtility xl = new XLUtility(path);

		xl.setCellData("listofletters", 0, 0, "BatchID");
		xl.setCellData("listofletters", 0, 1, "LetterID");
		xl.setCellData("listofletters", 0, 2, "Letter Name");
		xl.setCellData("listofletters", 0, 3, "Office");
		xl.setCellData("listofletters", 0, 4, "Year");
		xl.setCellData("listofletters", 0, 5, "TemplateName");
		xl.setCellData("listofletters", 0, 6, "ClientName");
		xl.setCellData("listofletters", 0, 7, "Partner");
		xl.setCellData("listofletters", 0, 8, "Admin");
		xl.setCellData("listofletters", 0, 9, "Status");

		WebElement table = driver.findElement(By.xpath(
				"//div[@class='engagement-letter bg-white px-4 py-3 rounded']//div[@class='table-responsive position-relative engagedash-table']//div[@class='p-datatable-scrollable-body ng-star-inserted']//tbody[@class='p-datatable-tbody']"));
		int rows = table.findElements(By.xpath("tr")).size();

		for (int i = 1; i < rows; i++) {

			String BatchID = table.findElement(By.xpath("tr[" + i + "]/td[1]")).getText();
			String LetterID = table.findElement(By.xpath("tr[" + i + "]/td[2]")).getText();
			String LetterName = table.findElement(By.xpath("tr[" + i + "]/td[3]")).getText();
			String Office = table.findElement(By.xpath("tr[" + i + "]/td[4]")).getText();
			String Year = table.findElement(By.xpath("tr[" + i + "]/td[5]")).getText();
			String TemplateName = table.findElement(By.xpath("tr[" + i + "]/td[6]")).getText();
			String ClientName = table.findElement(By.xpath("tr[" + i + "]/td[7]")).getText();
			String Partner = table.findElement(By.xpath("tr[" + i + "]/td[8]")).getText();
			String Admin = table.findElement(By.xpath("tr[" + i + "]/td[9]")).getText();
			String Status = table.findElement(By.xpath("tr[" + i + "]/td[10]")).getText();

			

				System.out.println(BatchID + LetterID + LetterName + Office + Year + TemplateName + ClientName + Partner
						+ Admin + Status);

				xl.setCellData("listofletters", i, 0, BatchID);
				xl.setCellData("listofletters", i, 1, LetterID);
				xl.setCellData("listofletters", i, 2, LetterName);
				xl.setCellData("listofletters", i, 3, Office);
				xl.setCellData("listofletters", i, 4, Year);
				xl.setCellData("listofletters", i, 5, TemplateName);
				xl.setCellData("listofletters", i, 6, ClientName);
				xl.setCellData("listofletters", i, 7, Partner);
				xl.setCellData("listofletters", i, 8, Admin);
				xl.setCellData("listofletters", i, 9, Status);

			}	
		
			System.out.println("Webtable scrapping Done successfully");
		}
		
		
}
	
