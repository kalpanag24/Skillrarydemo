package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoPage;
import pomPages.SkillraryPage;

public class Testcase1 extends BaseClass{
	@Test
	public void tc1() {
		SkillraryPage s=new SkillraryPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		Driverutilies.switchTabs(driver);
		SkillraryDemoPage sd=new SkillraryDemoPage(driver);
		Driverutilies.mouseHover(driver,sd.getCoursetab());
		sd.seleniumtraining();
		
		AddtocartPage a=new AddtocartPage(driver);
		Driverutilies.doubleclick(driver,a.getAddbtn());
		a.addtocartbutton();
		Driverutilies.alertpopup(driver);
	}
}
