package project.functional.entities.helpers;

import project.functional.entities.pages.AbstractPage;

public class AbstractHelper {
    AbstractPage abstractPage = new AbstractPage();

    public void quit(){
        abstractPage.getDriver().quit();
    }
}
