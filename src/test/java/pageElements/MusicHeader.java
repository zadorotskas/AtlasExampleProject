package pageElements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface MusicHeader extends AtlasWebElement<MusicHeader> {
    @FindBy("//input[@data-tsid = 'inner_input']")
    AtlasWebElement<?> searchInput();

    @FindBy("//*[@data-l='t,suggests']/*[@data-l='t,submit']")
    AtlasWebElement<?> searchSubmitButton();

    default void search(String query) {
        searchInput().sendKeys(query);
        searchSubmitButton().click();
    }
}
