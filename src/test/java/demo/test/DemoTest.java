package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class DemoTest extends BaseTest {
	//private WebElement element;
	
	public void runTest() {

		logger.step(1);
		FindKatalogMain fdk = new FindKatalogMain();

		logger.step(2);
		RazdelTV rtv = new RazdelTV();

		logger.step(3);
		PodborModel mdl = new PodborModel();
		mdl.assertModel();

		logger.step(4);
		PodborPrice prtv = new PodborPrice();
		prtv.assertPrice();

		logger.step(5);
		PodborData prd = new PodborData();
		prd.assertData();

		logger.step(6);
		PodborRaz raz = new PodborRaz();
		raz.assertRaz();


		//logger.step(7);
		//PodborD dgt = new PodborD();
		//dg42.assertDiag();


		//logger.step(1);
		//TutSearchForm tsf = new TutSearchForm();
		//tsf.assertLogo();

		//logger.step(2);
		//tsf.searchFor("A1QA");

		//logger.step(3);
		//tsf.assertA1QAString();
	}
}
